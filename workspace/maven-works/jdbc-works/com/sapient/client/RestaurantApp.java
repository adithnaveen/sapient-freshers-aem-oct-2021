package com.sapient.client;

import com.sapient.beans.Restaurant;
import com.sapient.dao.IRestaurantDAO;
import com.sapient.dao.RestaurantDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RestaurantApp {
	public static void main(String[] args) {
//		Restaurant restaurant = new Restaurant(); 
//		restaurant.setRId(108);
//		restaurant.setRName("Indraprasta");
//		restaurant.setCity("Bengaluru");
//		restaurant.setState("KA");
//		restaurant.setPhone("5656565656");
//		restaurant.setEmai("indra@gmail.com");
//		
		
		IRestaurantDAO dao = new RestaurantDAO(); 
//		boolean flag = dao.insertRestaurant
//				(restaurant);
//		log.info("{}", flag?"Record Inserted":"Not Inserted");
		
		
		dao.updateRestaurant(101, "ashoka_new@gmail.com");
		
	}
}
