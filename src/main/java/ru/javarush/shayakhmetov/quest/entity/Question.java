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

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}