package com.servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.model.Employee;
import com.util.EmployeeDBUtil1;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
// Login Controller class
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("pemail"); // <input name="pemail"
		String password = request.getParameter("password"); //<input name ="password"
		
		try {
			List<Employee> cusDetails = EmployeeDBUtil1.validate(email, password);
			request.setAttribute("cusDetails", cusDetails); // can give any name for "cusDetails"
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("userAccount.jsp");
		
		dis.forward(request, response);
	}

}