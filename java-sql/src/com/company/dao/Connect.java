package com.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    private static final String url = "jdbc:postgresql://localhost:5432/";
    private static final String user = "postgres";
    private static final String password = "0771541217b";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
