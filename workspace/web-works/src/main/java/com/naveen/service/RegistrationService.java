package com.naveen.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.naveen.beans.Registration;
import com.naveen.beans.Restaurant;

public class RegistrationService {
	public boolean register(Registration reg) { 
		return reg.getUserName().length()>6;
	}
	private Connection connection; 
	
	public RegistrationService() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection
					("jdbc:mysql://localhost/sap_aem", "root", "kanchan@1");
			System.out.println("Connection object is " + connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Restaurant> getAllRestaurants()  {
		String sql ="select rname, city from restaurant";
		List<Restaurant> list = null;
		try {
			PreparedStatement ps = connection.prepareStatement(sql); 
			list = new ArrayList<>(); 
			ResultSet rs = ps.executeQuery(); 
			while(rs.next()) {
				Restaurant r = new Restaurant(); 
				r.setRestName(rs.getString(1));
				r.setCity(rs.getString(2));
				list.add(r); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 	
	 	return list; 
	}
	public Restaurant getRestaurantById(int rid) {
		String sql ="select rname, city from restaurant where rid = ?";
		try (PreparedStatement ps = connection.prepareStatement(sql); ){
			
			ps.setInt(1, rid);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				Restaurant rest = new Restaurant(); 
				rest.setRestName(rs.getString(1));
				rest.setCity(rs.getString(2));
				return rest; 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; 
	}
}
