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
 * Servlet implementation class modifyUserServelet
 */
@WebServlet("/modifyUserServelet")
public class modifyUserServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String position = request.getParameter("position");
		String phone = request.getParameter("phone");
		String nic = request.getParameter("nic");
		String password = request.getParameter("password");
		String email = request.getParameter("pemail");
		
		System.out.println("***id "+id+" name "+name+"position"+position+" Phone "+phone+"NIC "+nic+" Password "+password+" Email "+email+"*****");
		
		boolean isTrue;
		
		isTrue = EmployeeDBUtil1.update(id, name, position, phone, nic, password, email);
		System.out.println("Is True = "+isTrue);
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
