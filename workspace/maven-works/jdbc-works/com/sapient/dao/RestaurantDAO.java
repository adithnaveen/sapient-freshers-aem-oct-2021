package com.sapient.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.sapient.beans.Restaurant;
import com.sapient.connection.GetConnection;

public class RestaurantDAO implements IRestaurantDAO{

	@Override
	public boolean insertRestaurant(Restaurant restaurant) {
		String sql ="insert into restaurant values(?,?,?,?,?,?)";
		try {
			PreparedStatement prepareStatement = GetConnection.getMysql().prepareStatement(sql);
			prepareStatement.setInt(1, restaurant.getRId());
			prepareStatement.setString(2, restaurant.getRName());
			prepareStatement.setString(3, restaurant.getCity());
			prepareStatement.setString(4, restaurant.getState());
			prepareStatement.setString(5, restaurant.getPhone());
			prepareStatement.setString(6, restaurant.getEmai());
			return prepareStatement.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Restaurant getRestaurant(int rId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> getAllRestaurants() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return false;
	}

}














