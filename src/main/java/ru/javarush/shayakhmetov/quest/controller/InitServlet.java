package ru.javarush.shayakhmetov.quest.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import ru.javarush.shayakhmetov.quest.entity.Answer;
import ru.javarush.shayakhmetov.quest.entity.Question;
import ru.javarush.shayakhmetov.quest.service.GameService;

import java.io.IOException;
import java.util.List;


@WebServlet(name = "start", value = "/start")
public class InitServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession currentSession = req.getSession(true);
        GameService service = GameService.newInstance();
        Question question = service.getQuestionFromRepository(0);

        String text = question.getText();
        Integer id = question.getId();
        List<Answer> answers = question.getAnswers();

        String ip = req.getRemoteAddr();

        currentSession.setAttribute("ip", ip);
        currentSession.setAttribute("text", text);
        currentSession.setAttribute("id", id);
        currentSession.setAttribute("answers", answers);


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(req, resp);
    }
}
