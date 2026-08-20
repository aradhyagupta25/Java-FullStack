package com.aradhyagupta25;


//A Java servlet is a Java class used to extend the capabilities of a server (most commonly a web server) to generate dynamic web content and handle client requests.they serve as an intermediary between a web browser and server-side applications or

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/hello")   // works in the case of external tomcat.
// we extend this class to create SERVLETS and override its methods.
public class HelloServlet extends HttpServlet
{
    // data from the client will be stored in "req". data to the client will be stored in "res".
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In Service");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        //res.getWriter().println("San Francisco");
        out.println("<h1>We are back</h1>");

    }


}
