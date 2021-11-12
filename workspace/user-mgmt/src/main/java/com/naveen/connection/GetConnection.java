package com.naveen.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
	
	private GetConnection(){}
	
	public static  Connection getMysql() {
		Connection connection; 
		// you are loading the connection 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection
					("jdbc:mysql://localhost/sap_aem", "root", "kanchan@1");
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
		return null; 
	}
	
}
