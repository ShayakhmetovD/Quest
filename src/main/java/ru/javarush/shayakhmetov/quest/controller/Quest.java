package ru.javarush.shayakhmetov.quest.controller;

import java.io.*;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import ru.javarush.shayakhmetov.quest.entity.Answer;
import ru.javarush.shayakhmetov.quest.entity.Question;
import ru.javarush.shayakhmetov.quest.service.GameService;

@WebServlet(name = "quest", value = "/quest")
public class Quest extends HttpServlet {
    public static final GameService gameService = GameService.newInstance();
    HttpSession currentSession;
    String answerFromJsp;
    Question question;
    public static int count;


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/quest.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        currentSession = req.getSession();
        answerFromJsp = req.getParameter("question");
        List<Answer> listAnswersFromSession = (List<Answer>) currentSession.getAttribute("answers");
        String textAnswer1 = listAnswersFromSession.get(0).getText();
        boolean isCorrectAnswer1 = listAnswersFromSession.get(0).isCorrect();
        String textAnswer2 = listAnswersFromSession.get(1).getText();
        boolean isCorrectAnswer2 = listAnswersFromSession.get(1).isCorrect();

        if (answerFromJsp.equals(textAnswer1) && isCorrectAnswer1) {
            count++;
            if (count < 3) {
                nextQuestion();
                getServletContext().getRequestDispatcher("/quest.jsp").forward(req, resp);
            }else {
                getServletContext().getRequestDispatcher("/finished.jsp").forward(req, resp);
            }

        } else if (answerFromJsp.equals(textAnswer2) && isCorrectAnswer2) {
            count++;
            if (count < 3) {
                nextQuestion();
                getServletContext().getRequestDispatcher("/quest.jsp").forward(req, resp);
            }else {
                getServletContext().getRequestDispatcher("/finished.jsp").forward(req, resp);
            }
        } else {
            getServletContext().getRequestDispatcher("/fail.jsp").forward(req, resp);
        }
    }

    private Question questionFromService() {
        return gameService.getQuestionFromRepository();
    }

    private void nextQuestion() {
        question = questionFromService();

        String text = question.getText();
        Integer id = question.getId();
        List<Answer> answers = question.getAnswers();

        currentSession.setAttribute("text", text);
        currentSession.setAttribute("id", id);
        currentSession.setAttribute("answers", answers);
    }
}
