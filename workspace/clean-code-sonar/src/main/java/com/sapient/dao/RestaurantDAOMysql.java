package com.sapient.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sapient.beans.Restaurant;
import com.sapient.connection.GetConnection;
import com.sapient.util.Util;

public class RestaurantDAOMysql implements IRestaurantDAO{

	@Override
	public boolean insertRestaurant(Restaurant restaurant) throws SQLException{
		// introduced in jdk 1.7 called as auto close where you dont have to handle exception 
		// look out for syntax of try block 
		
		String sql =Util.getSqlQuery("insertRestaurant"); 
		 try (PreparedStatement prepareStatement = GetConnection.getMysql().prepareStatement(sql);) {
				prepareStatement.setInt(1, restaurant.getRId());
				prepareStatement.setString(2, restaurant.getRName());
				prepareStatement.setString(3, restaurant.getCity());
				prepareStatement.setString(4, restaurant.getState());
				prepareStatement.setString(5, restaurant.getPhone());
				prepareStatement.setString(6, restaurant.getEmai());
				return prepareStatement.executeUpdate()>0;
		 }
	}

	@Override
	public Restaurant getRestaurant(int rId) {
		String sql ="select rid,rname,city,state,phone,email from restaurant where rid = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			 ps = GetConnection.getMysql().prepareStatement(sql);
			ps.setInt(1, rId);
			
			 rs = ps.executeQuery();
			
			if(rs.next()) {
				Restaurant restaurant = new Restaurant(); 
				restaurant.setRId(rs.getInt(1));
				restaurant.setRName(rs.getString(2));
				restaurant.setCity(rs.getString(3));
				restaurant.setState(rs.getString(4));
				restaurant.setPhone(rs.getString(5));
				restaurant.setEmai(rs.getString(6));
				
				return restaurant; 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
			
			if(rs!=null) {
				try {rs.close(); } catch(SQLException sqle) {sqle.printStackTrace();}
			}
			
		}
		return null;
	}

	@Override
	public List<Restaurant> getAllRestaurants() {

		String sql ="select rid,rname,city,state,phone,email from restaurant"; 
		
		List<Restaurant> restaurantList = null;
		 
		try {
			PreparedStatement ps = GetConnection.getMysql().prepareStatement(sql);
			restaurantList = new ArrayList<>();
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Restaurant restaurant = new Restaurant(); 
				restaurant.setRId(rs.getInt(1));
				restaurant.setRName(rs.getString(2));
				restaurant.setCity(rs.getString(3));
				restaurant.setState(rs.getString(4));
				restaurant.setPhone(rs.getString(5));
				restaurant.setEmai(rs.getString(6));
				
				restaurantList.add(restaurant);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return restaurantList;
	}

	@Override
	public boolean updateRestaurant(int rId, String email) {
		String sql = "update restaurant set email = ? where rid = ?"; 
		PreparedStatement ps = null; 
		try {
			 ps = GetConnection.getMysql().prepareStatement(sql);
			ps.setString(1, email);
			ps.setInt(2, rId);
			return ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
		}
		
		return false;
	}

	@Override
	public boolean deleteRestaurant(int rId) {
		String sql ="delete from restaurant where rid =?"; 
		PreparedStatement ps = null; 
		try {
			 ps = GetConnection.getMysql().prepareStatement(sql);
			ps.setInt(1, rId);
			return ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
		}
		return false;
	}

}














