package ru.javarush.shayakhmetov.quest.entity;

public class Answer {
    Integer id;
    String text;
    boolean correct;


    public Answer() {
    }
    public Answer(Integer id, String text, boolean correct) {
        this.id = id;
        this.text = text;
        this.correct = correct;
    }
    public Integer getId() {
        return id;
    }
    public String getText() {
        return text;
    }
    public boolean isCorrect() {
        return correct;
    }

}
