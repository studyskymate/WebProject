package com.studyskymate.dinesh.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");  
		 PrintWriter out = response.getWriter();  
		 
		 
		 String name=request.getParameter("userName");  
		 String password=request.getParameter("userPass");  
		 
		 if(name.equals("dinesh") && password.contentEquals("1234") ) {
			 
	  
			 
			RequestDispatcher rd  = request.getRequestDispatcher("success");
			rd.forward(request, response);
		
		 
		 }else {
			 out.print("Sorry Invalid UserName or Password !"); 
			 RequestDispatcher rd=request.getRequestDispatcher("/home.jsp");
			 rd.include(request, response); 
		 }
		 
	}

}
