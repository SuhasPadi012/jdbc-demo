package com.targetIndia.programs;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;
public class ListAllLoadedJdbcDrivers {
    public static void main(String[] args) throws Exception{
     Enumeration<Driver> drivers =DriverManager.getDrivers();
     System.out.println("These are the drivers maintained by the Driver Manager");
     while(drivers.hasMoreElements()){
         Driver driver=drivers.nextElement();
         System.out.println(driver.getClass().getName());
     }
    }
}

