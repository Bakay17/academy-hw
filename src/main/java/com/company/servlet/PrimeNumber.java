package com.company.servlet;

import com.company.model.PrimeNumberModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/primeNumber")
public class PrimeNumber extends HttpServlet {
    private boolean checkSimple(int n){
        for (int i = 2; i <= n / 2; i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Integer> tempList = new ArrayList<>();
        List<PrimeNumberModel> list = new ArrayList<>();
        int count = 0, i = 2;
        while (count <= 100) {
            if (checkSimple(i)) {
                count++;
                tempList.add(i);
            }
            i++;
        }
        count = 0;
        for (int j = 0; j < tempList.size(); j += 7) {
            if (j >= 98)
                break;
            if (count == 0) {
                count = 1;
                list.add(new PrimeNumberModel(
                        new Integer[]{
                                tempList.get(j),
                                tempList.get(j + 1),
                                tempList.get(j + 2),
                                tempList.get(j + 3),
                                tempList.get(j + 4),
                                tempList.get(j + 5),
                                tempList.get(j + 6),
                                tempList.get(j + 7)},
                        new String[]{
                                "white",
                                "black",
                                "white",
                                "black",
                                "white",
                                "black",
                                "white",
                                "black"}));
            } else if (count == 1) {
                count = 0;
                list.add(new PrimeNumberModel(
                        new Integer[]{
                                tempList.get(j),
                                tempList.get(j + 1),
                                tempList.get(j + 2),
                                tempList.get(j + 3),
                                tempList.get(j + 4),
                                tempList.get(j + 5),
                                tempList.get(j + 6),
                                tempList.get(j + 7)},
                        new String[]{
                                "black",
                                "white",
                                "black",
                                "white",
                                "black",
                                "white",
                                "black",
                                "white"}));
            }
        }
        req.setAttribute("list", list);
        req.getRequestDispatcher("/pages/Chess.jsp").forward(req, resp);
    }}
