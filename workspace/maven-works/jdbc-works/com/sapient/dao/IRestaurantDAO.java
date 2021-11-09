package com.sapient.dao;

import java.util.List;

import com.sapient.beans.Restaurant;

public interface IRestaurantDAO {
	boolean insertRestaurant(Restaurant restaurant); 
	Restaurant getRestaurant(int rId); 
	List<Restaurant> getAllRestaurants();
	boolean updateRestaurant(int rId, String email); 
	boolean deleteRestaurant(int rId);
}
