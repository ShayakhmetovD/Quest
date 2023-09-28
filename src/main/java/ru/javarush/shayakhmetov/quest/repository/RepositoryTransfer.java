package ru.javarush.shayakhmetov.quest.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.javarush.shayakhmetov.quest.entity.Question;

import java.io.*;
import java.util.List;

public class RepositoryTransfer implements Repository{
    private static RepositoryTransfer repositoryTransfer;
    private static int count = 0;

    private static final String filePath = "/Users/danil/Desktop/Проекты по лекциям/МОИ ПРОЕКТЫ ПО КУРСУ/3 модуль" +
            "/ru.javarush.shayakhmetov.quest/src/main/java/ru/javarush/shayakhmetov/quest/data.json";

    private RepositoryTransfer() {
    }

    public static RepositoryTransfer newInstance(){
        if(repositoryTransfer == null){
            repositoryTransfer = new RepositoryTransfer();
        }
        return repositoryTransfer;
    }


    @Override
    public Question transfer() {
        File file = new File(filePath);
        ObjectMapper objectMapper = new ObjectMapper();
        List<Question> questions;
        Question question;
        try {
            questions = objectMapper.readValue(file, new TypeReference<>() {
            });

            if (count == 4) {
                return null;
            }else {
                question = questions.get(count);
                count++;
                return question;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}