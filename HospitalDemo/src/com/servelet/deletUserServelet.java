package com.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.EmployeeDBUtil1;

/**
 * Servlet implementation class deletUserServelet
 */
@WebServlet("/deletUserServelet")
public class deletUserServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");
		System.out.println("Servelet ID = "+id);
		boolean isTrue;
		
		isTrue = EmployeeDBUtil1.deletEmp(id);
		
		if(isTrue == true) {
			// How to display as massage " Sucess"
			RequestDispatcher dispatcher = request.getRequestDispatcher("Sucess.jsp");
			dispatcher.forward(request, response);
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Unsucess.jsp");
			dispatcher.forward(request, response);
		}
	}

}
