package com.company.servlet;

import com.company.model.RandomNumberModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/randomSum")
public class RandomSum extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("randomObj", new RandomNumberModel(
                new Random().nextInt(11),
                new Random().nextInt(11)));
        req.getRequestDispatcher("/pages/RandomNumber.jsp").forward(req, resp);
    }
}
