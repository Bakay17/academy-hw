package org.example.servlets;

import org.example.dao.impl.UsersDaoImpl;
import org.example.model.User;
import org.example.model.UserLog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/authorization")
public class Authorization extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (login == null || login.isEmpty()) {
            if (password == null || password.isEmpty()) {
                printWriter = resp.getWriter();
                printWriter.println("<h1 align=\"center\">Поле не заполнено!</h1>");
            } else {
                User user = new UsersDaoImpl().checkUserLogin(login);
                if (user != null) {
                    UserLog userLog = new UserLog();
                    userLog.setId(user.getId());
                    boolean flag = user.getPassword().equals(password);
                    userLog.setGood(flag);
                    new UsersDaoImpl().createUserLog(userLog);
                    if (flag) {
                        req.setAttribute("result", "Гуд монинг " + user.getLogin());
                        req.getRequestDispatcher("/pages/resultUser.jsp").forward(req, resp);
                    } else {
                        printWriter = resp.getWriter();
                        printWriter.println("<h1 align=\"center\">Чтото не так</h1>");
                    }
                } else {
                    printWriter = resp.getWriter();
                    printWriter.println("<h1 align=\"center\">Пользователь не существует</h1>");
                }
            }
        }
    }
}
