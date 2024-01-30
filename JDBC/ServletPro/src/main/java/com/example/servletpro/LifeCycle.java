package com.example.servletpro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/lc")
public class LifeCycle extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init() method is called");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doget() service method is called");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() method is called");
    }
}
