package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminLogout
 */
@WebServlet("/AdminLogout")
public class AdminLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");  
	    PrintWriter out=response.getWriter();  
	    
	    request.getRequestDispatcher("Admin/adminlogin.jsp").include(request, response);  
	      
	    HttpSession session=request.getSession();  
	    session.invalidate();  
	    
	    out.print("<html><body>");  
        out.print("<b style='font-size:18px;color:red;position:relative;top:20px;left:520px;'>You have successfully logged out</b>");  
        out.print("</body></html>");
                        
        out.close();
	}

}
