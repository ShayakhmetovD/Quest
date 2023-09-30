package ru.javarush.shayakhmetov.quest.entity;

import java.util.List;

public class Question {
    Integer id;
    String text;
    List<Answer> answers;

    public Question() {
    }
    public Question(Integer id, String text, List<Answer> answers) {
        this.id = id;
        this.text = text;
        this.answers = answers;
    }
    public Integer getId() {
        return id;
    }
    public String getText() {
        return text;
    }
    public List<Answer> getAnswers() {
        return answers;
    }
}