package com.assignment2.assignment2.storage;

import java.util.ArrayList;
import java.util.List;
import com.assignment2.assignment2.models.MealOrder;

//MISSING REMOVE AND UPDATE METHOD

public class MealOrderStorage {

	private List<MealOrder> orders = new ArrayList<MealOrder>();
	
	public List<MealOrder> getOrders(){
		return this.orders;
	}
	
	public int add(MealOrder order) {
		this.orders.add(order);
		return order.getUserId();
	}
	
	public MealOrder getMealOrderByUserId(int userId) {
		for(MealOrder order : this.orders){
			if(order.getUserId() == userId) {
				return order;
			}
		}
		return null;
	}
	
	public List<MealOrder> getMealOrdersByUserId(int userId) {
		List<MealOrder> foundOrders = new ArrayList<MealOrder>();
		
		for(MealOrder order : this.orders){
			if(order.getUserId() == userId) {
				foundOrders.add(order);
			}
		}
		return foundOrders;
	}
	
	public MealOrder getMealOrderByMealId(int mealId) {
		for(MealOrder order : this.orders){
			if(order.getMealId() == mealId) {
				return order;
			}
		}
		return null;
	}
	
	public List<MealOrder> getMealOrdersByMealId(int mealId) {
		List<MealOrder> foundOrders = new ArrayList<MealOrder>();
		
		for(MealOrder order : this.orders){
			if(order.getMealId() == mealId) {
				foundOrders.add(order);
			}
		}
		return foundOrders;
	}
}
