package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "8496";
        Connection con = null;
        Statement stmt=null;
        ResultSet res = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver successfully loaded");

            con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection is established");

            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,0);
            String query = "select * from emp";
            res = stmt.executeQuery(query);

            while (res.next()) {
                System.out.println(res.getInt("id") + " " + res.getString("name") + " " + res.getString("designation") + " " + res.getInt("salary"));
            }

            res.first(); // to go for first line
            System.out.println(res.getInt("id") + " " + res.getString("name") + " " + res.getString("designation") + " " + res.getInt("salary"));

            res.absolute(3); // to go for specific line
            System.out.println(res.getInt("id") + " " + res.getString("name") + " " + res.getString("designation") + " " + res.getInt("salary"));

            ResultSetMetaData metaData = res.getMetaData();
            System.out.println(metaData.getColumnCount());
            System.out.println(metaData.getColumnName(1)+" "+metaData.getColumnName(2)+" "+metaData.getColumnName(3)+" "+metaData.getColumnName(4));

            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                System.out.println(metaData.getColumnName(i)+" "+metaData.getColumnTypeName(i));
            }
            System.out.println();


        } catch (ClassNotFoundException e) {
            System.out.println("Driver not loaded");
        } catch ( SQLException e) {
            System.out.println("Connection is not established");
        }
        try {
            res.close();
            stmt.close();
            con.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}