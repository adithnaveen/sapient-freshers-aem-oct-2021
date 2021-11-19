package com.sapient.client;

import java.util.List;

import com.sapient.beans.Restaurant;
import com.sapient.dao.IRestaurantDAO;
import com.sapient.dao.RestaurantDAODB2;
import com.sapient.dao.RestaurantDAOMysql;


class RestauantCRUD {
	public static List<Restaurant> getAllRestaurants(IRestaurantDAO dao) {
		return dao.getAllRestaurants(); 
	}
}

public class RestaurantApp1 {
	public static void main(String[] args) {
		RestaurantDAODB2 dao = new RestaurantDAODB2(); 
		RestauantCRUD.getAllRestaurants(dao); 
		
		RestaurantDAOMysql dao1 = new RestaurantDAOMysql();
		RestauantCRUD.getAllRestaurants(dao1); 
		
		//... 
	}
}
