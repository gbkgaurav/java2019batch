package com.gaurav.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static void main(String[] args) throws SQLException {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbconnect", "root", "gbk123");
            Statement st = con.createStatement();
            String st1= "update hero set name='Knife Party' where id = 5";
            st.executeUpdate(st1);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}