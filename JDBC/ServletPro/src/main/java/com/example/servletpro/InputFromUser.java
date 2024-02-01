package com.example.servletpro;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/user")
public class InputFromUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Enumeration<String> pN = req.getParameterNames();
//        while (pN.hasMoreElements()) {
//            System.out.println(pN.nextElement());
//        }
        String name = req.getParameter("name");
        String desig = req.getParameter("desig");
        String[] pV = req.getParameterValues("techskills");
        System.out.println("name="+name);
        System.out.println("desig="+desig);
        
        for(String i:pV)
            System.out.println(i);


        // send response to client
//        RequestDispatcher rd = req.getRequestDispatcher("staticresp.html");
//        rd.forward(req,resp);



        // dynamic response

        PrintWriter writer = resp.getWriter();
        writer.println("<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h3>Thank you for your response "+name+"</h3>\n" +
                "</body>\n" +
                "</html>");

    }
}
