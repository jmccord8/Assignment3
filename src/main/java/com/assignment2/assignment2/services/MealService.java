package com.assignment2.assignment2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment2.assignment2.models.Meal;
import com.assignment2.assignment2.repositories.MealRepo;

@Service
public class MealService {

	@Autowired
	private MealRepo mealRepo;
	
	public List<Meal> getMeals(){
		return mealRepo.getMeals();
	}
	
	public List<Meal> getMealsByType(String type){
		return mealRepo.getMealsByType(type);
	}
	
	public Meal getMealByID(int id) throws Exception
	{
		if(id > 0) {
			return mealRepo.getMeal(id);
		}
		throw new Exception("Meal doesn't exist");
	}
	
	public String getMealType(int id) throws Exception
	{
		if(id > 0) {
			return mealRepo.getMeal(id).getType();
		}
		throw new Exception("Meal doesn't exist");
	}
	
	public String getMealCombo(int id) throws Exception
	{
		if(id > 0) {
			return mealRepo.getMeal(id).getCombo();
		}
		throw new Exception("Meal doesn't exist");
	}
	
	public int add(Meal meal) {
		return mealRepo.add(meal);
	}
	
	public void remove(Meal meal) {
		mealRepo.remove(meal);
	}
	
	public void updateMeal(Meal meal, int mealId)
	{
		mealRepo.updateMeal(meal, mealId);
	}
}
