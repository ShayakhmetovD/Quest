package ru.javarush.shayakhmetov.quest.service;


import ru.javarush.shayakhmetov.quest.entity.Question;
import ru.javarush.shayakhmetov.quest.repository.RepositoryTransfer;


public class GameService {
    private final RepositoryTransfer transfer = RepositoryTransfer.newInstance();
    public static GameService gameService;


    private GameService() {
    }

    public static GameService newInstance() {

        if (gameService == null){
            gameService = new GameService();
        }
        return gameService;
    }

    public Question getQuestionFromRepository(int idQuestion){
        return transfer.transfer(idQuestion);
    }

    public int getSizeByListQuestions(){
        return transfer.sizeByListQuestions();
    }
}
