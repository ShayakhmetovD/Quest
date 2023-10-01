package ru.javarush.shayakhmetov.quest.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.javarush.shayakhmetov.quest.entity.Question;

import java.io.*;
import java.util.List;

public class RepositoryTransfer implements Repository{
    private static RepositoryTransfer repositoryTransfer;
    public List<Question> questions;

    private static final String filePath = "/Users/danil/Desktop/Проекты по лекциям/МОИ ПРОЕКТЫ ПО КУРСУ/" +
            "3 модуль/Quest/src/main/java/ru/javarush/shayakhmetov/quest/db/data.json";

    private RepositoryTransfer() {
    }

    public static RepositoryTransfer newInstance(){
        if(repositoryTransfer == null){
            repositoryTransfer = new RepositoryTransfer();
        }
        return repositoryTransfer;
    }


    @Override
    public Question transfer(int idQuestion) {
        File file = new File(filePath);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            questions = objectMapper.readValue(file, new TypeReference<>() {
            });

            return questions.get(idQuestion);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int sizeByListQuestions(){
        return questions.size();
    }
}