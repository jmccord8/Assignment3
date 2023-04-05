package com.assignment2.assignment2.storage;
import java.util.List;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

import com.assignment2.assignment2.models.Meal;

public class MealStorage {
	Dictionary<Integer,Meal> meals = new Hashtable<>();
	
	public List<Meal> getMeals(){
		List<Meal> allMeals = new ArrayList<>();
        Enumeration<Integer> e = meals.keys();
        while(e.hasMoreElements()) {
            Integer k = e.nextElement();
            allMeals.add(meals.get(k));
        }
        return allMeals;
	}
	
	public List<Meal> getMealsByType(String type) {
		List<Meal> mealTypes = new ArrayList<Meal>();
        Enumeration<Integer> e = meals.keys();
        while(e.hasMoreElements()) {
            Integer k = e.nextElement();
            if(meals.get(k).getType().equalsIgnoreCase(type)) {
            	mealTypes.add(meals.get(k));
            }
        }
		return mealTypes;
	}
	
	public Meal getMeal(int id)
	{
		return meals.get(id);
	}
	
	public String getMealType(int id)
	{
		return meals.get(id).getType();
	}
	
	public String getMealCombo(int id)
	{
		return meals.get(id).getCombo();
	}
	
	public int add(Meal meal) {
		int newID = meals.size() + 1;
		meal.setId(newID);
		meals.put(meal.getId(), meal);

		return meal.getId();
	}
	
	public void remove(Meal meal) {
		meals.remove(meal.getId());
	}
	
	public void updateMeal(Meal meal, int mealId)
	{
		meals.remove(mealId);
		meals.put(mealId, meal);
	}
	
}
