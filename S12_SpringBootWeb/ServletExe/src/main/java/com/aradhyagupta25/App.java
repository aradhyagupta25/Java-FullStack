package com.aradhyagupta25;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );

        Tomcat tomcat = new Tomcat();   // creating a tomcat object.

        tomcat.setPort(6969);   // by default port no: 8080 -> 6969

        // mapping to the embedded tomcat.
        // passing two parameters: name of application (default in this case ) , no new directory structure (null).
        Context context = tomcat.addContext("", null);

        // 3 parameters: context, name of the servlet, object.
        Tomcat.addServlet(context, "servlet1", new HelloServlet());
        context.addServletMappingDecoded("/hello", "servlet1");

        tomcat.start(); // starting the tomcat. after staring, it will end it.
        tomcat.getServer().await(); //tells the tomcat to wait and not end instantly.

    }
}
