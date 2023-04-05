package com.assignment2.assignment2.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MealOrder {

	public int userId;
	public String orderTime;
	public int mealId;
	
	public MealOrder(int userId, int mealId) {
		this.userId = userId;
		this.createDateTime();
		this.mealId = mealId;
	}
	
	private void createDateTime() {
	    LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    this.orderTime = formattedDate;
	}

	public int getUserId() {
		return userId;
	}

	public String getOrderTime() {
		return orderTime;
	}
	
	public int getMealId() {
		return mealId;
	}
	
	public void setMealId(int mealId) {
		this.mealId =  mealId;
	}
	
}
