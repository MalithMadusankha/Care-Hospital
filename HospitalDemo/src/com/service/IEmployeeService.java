/**
 * 
 */
package com.service;

import java.util.ArrayList;
import java.util.logging.Logger;

import com.model.Employee;
import com.service.IEmployeeService;

/**
 * @author Malith
 *
 */
public interface IEmployeeService {
	/** Initialize logger */
	public static final Logger log = Logger.getLogger(IEmployeeService.class.getName());


	/**
	 * Add employees for employee table
	 * @param employee
	 */
	public void addEmployee(Employee employee);

	/**
	 * Get a particular Employee
	 * 
	 * @param empoyeeID
	 * @return Employee
	 */
	public Employee getEmployeeByID(String empoyeeID);
	
	/**
	 * Get all list of employees
	 * 
	 * @return ArrayList<Employee>
	 */
	public ArrayList<Employee> getEmployees();
	
	/**
	 * Update existing employee
	 * @param employeeID
	 * @param employee
	 * 
	 * @return
	 */
	public Employee updateEmployee(String employeeID, Employee employee);

	/**
	 * Remove existing employee
	 * 
	 * @param employeeID
	 */
	public void removeEmployee(String employeeID);

}
