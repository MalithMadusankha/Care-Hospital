package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.model.Employee;

public class EmployeeDBUtil1 {
	
	
	public static List<Employee> validate(String email, String password) {
		
		ArrayList<Employee> cus = new ArrayList<>();
		
		// Create Data Base connection
		//String url = "http://localhost:8080/hospitallgdb";
		String url = "jdbc:mysql://localhost:3306/hospitallgdb";
		String user = "root";
		String pwd ="1234";
		
		// Validate 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pwd);
			Statement stmt = con.createStatement();
			
			String sql = "SELECT * FROM employee where email = '" + email + "' AND password = '" + password +"' ";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String position = rs.getString(3);
				String phone = rs.getString(4);
				String nic = rs.getString(5);
				String password1 = rs.getString(6);
				String email1 = rs.getString(7);
				
				Employee c =  new Employee(id, name, position, phone, nic, password1, email1);
				// Passing customer object to cus array list
				cus.add(c);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return cus;
		
	}
	public static boolean insertEmployee(String id, String name, String position, String phone, String nic, String password, String email) {
		
		boolean isSucess = false;
		
		//Create data base connection
		String url = "jdbc:mysql://localhost:3306/hospitallgdb";
		String user = "root";
		String pwd ="1234";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pwd);
			Statement stmt = con.createStatement();
			
			String sql = "INSERT INTO Employee VALUES ('"+id+"','"+name+"','"+position+"','"+phone+"','"+nic+"','"+password+"','"+email+"') ";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSucess = true;
			}else {
				isSucess = false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return isSucess;
	}
	
	public static List<Employee> search(String id) {
		
		ArrayList<Employee> emp = new ArrayList<>();
		
		// Create Data Base connection
		//String url = "http://localhost:8080/hospitallgdb";
		String url = "jdbc:mysql://localhost:3306/hospitallgdb";
		String user = "root";
		String pwd ="1234";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pwd);
			Statement stmt = con.createStatement();
			
			String sql = "SELECT * FROM employee where idEmployee='" + id + "' ";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String id1 = rs.getString(1);
				String name = rs.getString(2);
				String position = rs.getString(3);
				String phone = rs.getString(4);
				String nic = rs.getString(5);
				String password = rs.getString(6);
				String email = rs.getString(7);
				
				
				Employee c =  new Employee(id1, name, position, phone, nic, password, email);
				// Passing customer object to emp array list
				emp.add(c);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return emp;
		
	}

	public static boolean update(String id, String name, String position, String phone, String nic, String password, String email) {
	
	boolean isSucess = false;
	
	//Create data base connection
	String url = "jdbc:mysql://localhost:3306/hospitallgdb";
	String user = "root";
	String pwd ="1234";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, user, pwd);
		Statement stmt = con.createStatement();
		
		String sql = "UPDATE Employee SET nameE='"+name+"',Position='"+position+"',phoneNumber='"+phone+"',NIC='"+nic+"',password='"+password+"',email='"+email+"' WHERE idEmployee='"+id+"' ";
		
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSucess = true;
		}else {
			isSucess = false;
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
	return isSucess;
}
	public static boolean deletEmp(String id) {
		
		String url = "jdbc:mysql://localhost:3306/hospitallgdb";
		String user = "root";
		String pwd ="1234";

		boolean sucess = false;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pwd);
			Statement stmt = con.createStatement();
			
			String sql = " DELETE FROM Employee WHERE idEmployee = '"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				sucess = true;
			}else {
				sucess = false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return sucess;
	}
}
