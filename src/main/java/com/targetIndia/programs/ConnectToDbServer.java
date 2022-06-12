package com.targetIndia.programs;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToDbServer {
    public static void main(String[] args) throws Exception{
        //To connect to a DB server:
        // Make sure that the suitable driver is loaded in the jvm by adding dependencies.
        //Using the jdbc url along with the server credentials and use the get connection of driver manager.
        String url="jdbc:mysql://localhost:3306/employee";
        String username="root";
        String password="Sqlroot@123";
        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("Get an object type: "+con.getClass( ));

    }

}
