package com.example.servletpro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("login")
public class LoginPage extends HttpServlet {

    Connection con=null;
    PreparedStatement pst=null;
    ResultSet res=null;


    String url = "jdbc:mysql://localhost:3306/";
    String username = "root";
    String password = "8496";
    @Override
    public void init() throws ServletException {
        try {
            con = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        String name = req.getParameter("name");
        String pwd = req.getParameter("password");

        try {
            String query = "select * from student where un=? and pwd =?";
            pst.executeQuery(query);
            pst.setString(1,name);
            pst.setString(2,pwd);
            res = pst.executeQuery();
            if(res.next()) {
                writer.println("<h3>Welcome"+res.getString(2)+"</h3");
            } else {
                writer.println("<h3>Invalid details try again");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
