package com.tmf.SMS.certification.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
	private Connection con;
	
	public Connection getConnection() {
		String url="jdbc:mysql://@localhost:3306/cijd_11";
		String user="root",pwd="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pwd);
			System.out.println("Connected with the data base");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}