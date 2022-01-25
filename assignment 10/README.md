## JDBC CRUD Operation
### Create
```package com.gaurav.db;
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
```
### Read
```
package com.gaurav.db;

import java.sql.*;

public class ReadDemo {
    public static void main(String[] args) throws SQLException {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbconnect", "root", "gbk123");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from artists");
            System.out.println("Id"+"\t"+"Name"+"\t"+"\t"+"\t"+"Rank");
            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+"\t"+rs.getString(3));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
```
### Update
```
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
```
### Delete
```
package com.gaurav.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteDemo {
    public static void main(String[] args) throws SQLException {
        try{
            Scanner sc = new Scanner (System.in);
            System.out.println ("enter hero id no\n");
            int id = sc.nextInt ();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbconnect", "root", "gbk123");

            Statement st = con.createStatement();
            int row = st.executeUpdate ("delete from artists where id = " +id);
            if (row == 0)
                System.out.println ("hero does not exist");
            else
                System.out.println ("hero removed successfully");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
```