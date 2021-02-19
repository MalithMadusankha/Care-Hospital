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
 * Servlet implementation class SearchEmployeeServlet
 */
@WebServlet("/SearchEmployeeServlet")
public class SearchEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("*****************come here********************");
		String id = request.getParameter("id");
		
		try {
			List<Employee> empDetails = EmployeeDBUtil1.search(id);
			System.out.print("empDetails"+empDetails.get(0).getName());
			request.setAttribute("empDetails", empDetails); // can give any name for "cusDetails"
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//RequestDispatcher dis = request.getRequestDispatcher("SearchEmployee.jsp");
		request.getRequestDispatcher("SearchEmployee.jsp").forward(request, response);
		
		//dis.forward(request, response);
	}

}
