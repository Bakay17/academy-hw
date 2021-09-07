package org.example.servlets;

import org.example.dao.impl.UsersDaoImpl;
import org.example.model.UserLog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/")
public class LoginUsersList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();

        List<UserLog> userLogs = new UsersDaoImpl().userLoginList();

        for (UserLog userLog : userLogs) {
            printWriter = resp.getWriter();
            printWriter.println("<ol>" + userLog + "</ol>");
        }
    }
}
