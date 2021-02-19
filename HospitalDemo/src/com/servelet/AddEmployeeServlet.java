package com.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
import com.service.EmployeeServiceImpl;
import com.service.IEmployeeService;
import com.util.EmployeeDBUtil1;

/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		Employee employee = new Employee();
		
		String id = request.getParameter("employeeID");
		String name = request.getParameter("employeeName");
		String position = request.getParameter("designation");
		String phone = request.getParameter("phone");
		String nic = request.getParameter("nic");
		String password = request.getParameter("password");
		String email = request.getParameter("email");

		boolean istrue;
		istrue = EmployeeDBUtil1.insertEmployee(id, name, position, phone, nic, password, email);
		
		if(istrue == true) {	
		
//		IEmployeeService iEmployeeService = new EmployeeServiceImpl();
//		iEmployeeService.addEmployee(employee);
//		request.setAttribute("employee", employee);
			
		RequestDispatcher dispatcher = request.getRequestDispatcher("Sucess.jsp");
		dispatcher.forward(request, response);
		}
		else {
//			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Unsucess.jsp");
			dispatcher.forward(request, response);
		}
	}

}
