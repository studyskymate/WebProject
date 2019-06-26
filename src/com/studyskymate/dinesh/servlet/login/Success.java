package com.studyskymate.dinesh.servlet.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/success")
public class Success extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Success() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
	    PrintWriter out= response.getWriter();
	    RequestDispatcher rd=request.getRequestDispatcher("/success.jsp");
	    rd.forward(request, response);
	}

}
