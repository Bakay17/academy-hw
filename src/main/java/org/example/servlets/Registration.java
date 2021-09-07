package org.example.servlets;

import org.example.dao.impl.UsersDaoImpl;
import org.example.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registration")
public class Registration extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        User user = new User(req.getParameter("login"), req.getParameter("email"), req.getParameter("password"));
        User userCheckLogin = new UsersDaoImpl().checkUserLogin(user.getLogin());
        User userCheckEmail = new UsersDaoImpl().checkUserEmail(user.getEmail());

        if(user.getLogin() == null || user.getLogin().isEmpty()) {
            printWriter = resp.getWriter();
            printWriter.println("<h1 align=\"center\">Поле не заполнено!</h1>");
        } else {
            if (userCheckLogin != null) {
                printWriter = resp.getWriter();
                printWriter.println("<h1 align=\"center\">Логин уже существует!</h1>");
            }
            if (userCheckEmail != null) {
                printWriter = resp.getWriter();
                printWriter.println("<h1 align=\"center\">Email уже существует!</h1>");
            }
            if (userCheckEmail == null && userCheckLogin == null) {
                user = new UsersDaoImpl().createUser(user);
                if (user.getId() != null) {
                    req.setAttribute("result", "Регистрация прошла успешно!");
                    req.getRequestDispatcher("/pages/resultUser.jsp").forward(req, resp);
                } else {
                    printWriter.println("<h1 align=\"center\">Технические неполадки, попробуйте позже...!</h1>");
                }
            }
        }

    }
}
