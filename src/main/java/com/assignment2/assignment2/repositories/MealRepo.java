package com.assignment2.assignment2.repositories;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.assignment2.assignment2.models.Meal;
import com.assignment2.assignment2.storage.MealStorage;

@Repository
public class MealRepo {
	public static MealStorage mealStorage = new MealStorage();
	
	static {
		Meal m1 = new Meal("Breakfast", "Sausage, grits, tea, toast");
		Meal m2 = new Meal("Breakfast", "Sausage, toast, coffee, scrambled eggs");
		Meal m3 = new Meal("Breakfast", "Sunny side up eggs, toast, water");
		
		mealStorage.add(m1);
		mealStorage.add(m2);
		mealStorage.add(m3);
	}
	
	public List<Meal> getMeals(){
		return mealStorage.getMeals();
	}
	
	public Meal getMeal(int id)
	{
		return mealStorage.getMeal(id);
	}
	
	public List<Meal> getMealsByType(String string)
	{
		return mealStorage.getMealsByType(string);
	}
	
	public int add(Meal meal) {
		return mealStorage.add(meal);
	}
	
	public void remove(Meal meal) {
		mealStorage.remove(meal);
	}
	
	public void updateMeal(Meal meal, int mealId)
	{
		mealStorage.updateMeal(meal, mealId);
	}
	
}
