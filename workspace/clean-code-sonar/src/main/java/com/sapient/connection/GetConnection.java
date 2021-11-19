package com.sapient.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GetConnection {
	private static  Connection connection; 
	public static  Connection getMysql() {
		// you are loading the connection 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection
					("jdbc:mysql://localhost/sap_aem", "root", "kanchan@1");
		
			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null; 
	}
	
	public Connection getOracle() {
		return null;
	}
	
	// other databases to connect 
	

	
}
