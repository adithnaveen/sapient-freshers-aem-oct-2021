package com.naveen.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.naveen.beans.User;
import com.naveen.connection.GetConnection;

public class UserService implements IUserService {

	@Override
	public User registerUser(String name, String email, String password) {

		String sql = "insert into users (name,email, password)  values (?,?,?)";

		try (PreparedStatement ps = GetConnection.getMysql().prepareStatement(sql);){
			
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			if(ps.executeUpdate()>0 ) 
				return new User(name, email, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User login(String email, String password) {
		String sql ="select name from users where email=? and password=?"; 
		
		try (PreparedStatement ps = GetConnection.getMysql().prepareStatement(sql);) {
			 
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return new User(rs.getString(1), email, password); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null; 
	}

}
