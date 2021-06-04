package ru.freeIT.bookProj.Query2.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectorService {
    public Connection getConnection() throws SQLException {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("connection");
        String url = resourceBundle.getString("url");
        String user = resourceBundle.getString("user");
        String password = resourceBundle.getString("password");
        return DriverManager.getConnection(url, user, password);
    }
}
