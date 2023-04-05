package com.assignment2.assignment2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.assignment2.assignment2.models.MealOrder;
import com.assignment2.assignment2.services.MealOrderService;


@RestController
@RequestMapping("/api/v1/mealorders")
public class MealOrderController {
    @Autowired
    private MealOrderService mealorderService;

    @GetMapping(path = "/", produces = "application/json")
    public List<MealOrder> getAllMealOrders() {
        return mealorderService.getOrders();
    }
    
	@RequestMapping(value="/", method=RequestMethod.POST, produces = "application/json")
	public MealOrder addMealOrder(@RequestBody MealOrder order){
		try
		{
			int id = mealorderService.add(order);
		    return mealorderService.getMealOrderByUserId(id);
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
		}	
	}
}
