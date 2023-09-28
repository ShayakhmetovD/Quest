package ru.javarush.shayakhmetov.quest.repository;


import ru.javarush.shayakhmetov.quest.entity.Question;

import java.io.IOException;

public interface Repository {

    Question transfer() throws IOException;
}