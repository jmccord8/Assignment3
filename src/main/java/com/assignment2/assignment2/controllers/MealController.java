package com.assignment2.assignment2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.assignment2.assignment2.models.Meal;
import com.assignment2.assignment2.services.MealService;

@RestController
@RequestMapping("/api/v1/meal")
public class MealController {
    @Autowired
    private MealService mealService;
    //ss
    @GetMapping(path = "/{mealtype}/{bid}",produces = "application/json")
    public Meal getMeal(@PathVariable int bid) {
    	try {
    		return mealService.getMealByID(bid);
    	}
    	catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}	
    }

    @GetMapping(path = "/{mealtype}",produces = "application/json")
    public List<Meal> getMealsByType(@PathVariable String mealtype) {
    	try {
    		return mealService.getMealsByType(mealtype);
    	}
    	catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}	   
    }
    
    @GetMapping(path = "/", produces = "application/json")
    public List<Meal> getAllMeals() {
        return mealService.getMeals();
    }

	@RequestMapping(value="/{mealtype}/{bid}", method=RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> updateMeal(@RequestBody Meal mealDetails, @PathVariable int bid) {
		try
		{
			mealService.updateMeal(mealDetails, bid);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}		    
	}
}
