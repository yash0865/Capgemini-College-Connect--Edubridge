package com.edu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCMainApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String username = "root";
		String password = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/college";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String name = "";
		String pass = "";

		Class.forName(driver);
		
		conn = DriverManager.getConnection(url,username,password);
		
		stmt = conn.createStatement();
		
		String s = "select * from login";
		
		rs = stmt.executeQuery(s);
		
		System.out.println("Name\tPassword");
		System.out.println("------------------");
		while(rs.next()) {
			name = rs.getString("username");
			pass = rs.getString("password");
			System.out.println(name+"\t"+pass);
		}
	}
}
