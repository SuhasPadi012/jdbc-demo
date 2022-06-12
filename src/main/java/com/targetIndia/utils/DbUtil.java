package com.targetIndia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public final class DbUtil {
    private DbUtil(){}
    public static Connection createConnection() throws ClassNotFoundException, SQLException {
        ResourceBundle rb=ResourceBundle.getBundle("jdbc-info");
        String driverClassName= rb.getString("jdbc.connection.driver-class-name");
        String url=rb.getString("jdbc.connection.url");
        String user=rb.getString("jdbc.connection.user");
        String pass=rb.getString("jdbc.connection.pass");
        Class.forName(driverClassName);
        return DriverManager.getConnection(url,user,pass);

    }
}
