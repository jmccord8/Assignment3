package com.assignment2.assignment2.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.assignment2.assignment2.models.MealOrder;
import com.assignment2.assignment2.storage.MealOrderStorage;

@Repository
public class MealOrderRepo {
	public static MealOrderStorage moStorage = new MealOrderStorage();
	
	static {
	//Add meal orders
		moStorage.add(new MealOrder(199,3));
		moStorage.add(new MealOrder(392,1));
		moStorage.add(new MealOrder(1192,2));
		moStorage.add(new MealOrder(290,2));
		moStorage.add(new MealOrder(581,1));
		moStorage.add(new MealOrder(281,2));
	}
	
	public int add(MealOrder order) {
		return moStorage.add(order);
	}
	
	public List<MealOrder> getOrders(){
		return moStorage.getOrders();
	}
	
	public MealOrder getMealOrderByUserId(int userId) {
		return moStorage.getMealOrderByUserId(userId);
	}
	
	public List<MealOrder> getMealOrdersByUserId(int userId) {
		return moStorage.getMealOrdersByUserId(userId);
	}
	
	public MealOrder getMealOrderByMealId(int mealId) {
		return moStorage.getMealOrderByMealId(mealId);
	}
	
	public List<MealOrder> getMealOrdersByMealId(int mealId) {
		return moStorage.getMealOrdersByMealId(mealId);
	}
}
