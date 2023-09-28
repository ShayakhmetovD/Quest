package ru.javarush.shayakhmetov.quest.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "restartServlet", value = "/restart")
public class Restart extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Ты проиграл, попробуй в другой раз!" + "</h1>");
        out.println("</body></html>");

        req.getSession().invalidate();
        resp.sendRedirect("/quest.jsp");
    }
}