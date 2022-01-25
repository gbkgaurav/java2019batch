package com.gaurav.db;
import java.sql.*;
public class InsertDemo {
    public static void main(String[] args) throws SQLException{
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbconnect", "root", "gbk123");

            Statement st = con.createStatement();

            String sql = "INSERT INTO hero VALUES (5,'BOB','unranked')";
            st.executeUpdate(sql);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}