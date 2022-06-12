package com.targetIndia.programs;

import com.targetIndia.utils.DbUtil;
import com.targetIndia.utils.KeyboardUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetOneEmployeeRecord {
    public static void main(String[] args) throws Exception{
        String sql="select * from employees where EmpId= ?";
        int id= KeyboardUtil.getInt("Enter the employee id");
        try(
                Connection conn= DbUtil.createConnection();
                PreparedStatement stmt=conn.prepareStatement(sql);

                ){
            stmt.setInt(1,id);
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){

                System.out.println("Name is "+rs.getString("EmpName"));
                System.out.println("Gender is "+rs.getString("EmpGender"));
            }
            else{
                System.out.println("No data found");
            }


        }
    }
}
