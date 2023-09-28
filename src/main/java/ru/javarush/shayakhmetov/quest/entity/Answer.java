package ru.javarush.shayakhmetov.quest.entity;

public class Answer {
    Integer id;
    String text;
    boolean correct;


    public Answer() {
    }

    public Answer(Integer id, String text) {
        this.id = id;
        this.text = text;
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

    public boolean isCorrect() {
        return correct;
    }

}
