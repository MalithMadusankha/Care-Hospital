package com.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionDB {
	
	private static String url = "jdbc:mysql://localhost:3306/hospitallgdb";
	private static String user = "root";
	private static String pwd ="1234";
	private static Connection con;

	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, pwd);
			
		}catch (Exception e) {
			System.out.println("Data Base connection Lost !!!!");
		}
		
		
		return con;
		
	}
}
