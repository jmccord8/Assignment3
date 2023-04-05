package com.assignment2.assignment2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment2.assignment2.models.MealOrder;
import com.assignment2.assignment2.repositories.MealOrderRepo;

@Service
public class MealOrderService {
	@Autowired
	private MealOrderRepo moRepo;
	
	public List<MealOrder> getOrders(){
		return moRepo.getOrders();
	}
	
	public int add(MealOrder order) {
		return moRepo.add(order);
	}
	
	public MealOrder getMealOrderByUserId(int userId) throws Exception {
		
		if(userId > 0) {
			return moRepo.getMealOrderByUserId(userId);
		}
		throw new Exception("Meal order doesn't exist");
	}
	
	public List<MealOrder> getMealOrdersByUserId(int userId) throws Exception {
		if(userId > 0) {
			return moRepo.getMealOrdersByUserId(userId);
		}
		throw new Exception("Meal order doesn't exist");
		
	}
	
	public MealOrder getMealOrderByMealId(int mealId) throws Exception {
		if(mealId > 0) {
			return moRepo.getMealOrderByMealId(mealId);
		}
		throw new Exception("Meal order doesn't exist");
	}
	
	public List<MealOrder> getMealOrdersByMealId(int mealId) throws Exception {
		if(mealId > 0) {
			return moRepo.getMealOrdersByMealId(mealId);
		}
		throw new Exception("Meal order doesn't exist");
	}
}
