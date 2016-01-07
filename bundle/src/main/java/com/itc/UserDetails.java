package com.itc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;

@ SlingServlet ( paths = { "/helloworld" } , methods = { "GET","POST" } , extensions = { "html" })
public class UserDetails extends SlingAllMethodsServlet{
	private static final long serialVersionUID = -3671121934066837321L;

	protected void doGet ( SlingHttpServletRequest req , SlingHttpServletResponse resp ) throws ServletException,IOException
    {
    	resp.setContentType("text/html");

         PrintWriter out = resp.getWriter();
         out.println("<h1>Hello World</h1>");
    }

}