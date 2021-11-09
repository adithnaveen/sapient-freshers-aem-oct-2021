package com.sapient.service;

import java.sql.SQLException;
import java.util.List;

import com.sapient.beans.Restaurant;
import com.sapient.dao.IRestaurantDAO;
import com.sapient.dao.RestaurantDAO;
import com.sapient.exception.NameTooShortException;

public class RestaurantService implements IRestaurantService {

	private IRestaurantDAO dao; 
	
	public RestaurantService() {
		dao = new RestaurantDAO(); 
	}
	
	@Override
	public boolean insertRestaurant(Restaurant restaurant) {
		
		
		try {
			// do a sanity check 
			if(restaurant.getRName().length() < 6) {
				throw new NameTooShortException("Name Too short"); 
			}
			dao.insertRestaurant(restaurant);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch(NameTooShortException ntse) {
			ntse.printStackTrace();
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRestaurant(int rId) {
		// TODO Auto-generated method stub
		return false;
	}

}
