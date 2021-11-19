package com.sapient.dao;

import java.sql.SQLException;
import java.util.List;

import com.sapient.beans.Restaurant;

public class RestaurantDAODB2 implements IRestaurantDAO {

	@Override
	public boolean insertRestaurant(Restaurant restaurant) throws SQLException {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRestaurant(int rId) {
		// TODO Auto-generated method stub
		return false;
	}

}
