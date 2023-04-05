package com.assignment2.assignment2.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.assignment2.assignment2.models.HelpRequest;
import com.assignment2.assignment2.storage.HelpRequestStorage;

@Repository
public class HelpRequestRepo {
	private static HelpRequestStorage hrStorage = new HelpRequestStorage();
	
	static {
		@SuppressWarnings("deprecation")
		Date date1 = new Date(2023,4,2,10,11,22);
		@SuppressWarnings("deprecation")
		Date date2 = new Date(2023,4,2,12,30,19);
		
		hrStorage.add(new HelpRequest("Jordan McCord", date1, "Medical"));
		hrStorage.add(new HelpRequest("Alex Jones", date1, "Feeding"));
		hrStorage.add(new HelpRequest("Mack Athers", date2, "Medical"));
		hrStorage.add(new HelpRequest("Louis Medrano", date1, "Medical"));
	}
	
	public List<HelpRequest> getRequests(){
		return hrStorage.getRequests();
	}
	
	public List<HelpRequest> getRequestByType(String type) {
		return hrStorage.getRequestByType(type);
	}
	
	public HelpRequest getRequest(int id)
	{
		return hrStorage.getRequest(id);
	}
	
	public String getRequesterName(int id)
	{
		return hrStorage.getRequesterName(id);
	}
	
	public Date getRequestDate(int id)
	{
		return hrStorage.getRequestDate(id);
	}
	
	public int add(HelpRequest request) {
		return hrStorage.add(request);
	}
	
	public void remove(HelpRequest request) {
		hrStorage.remove(request);
	}
	
	public void updateRequest(HelpRequest request)
	{
		hrStorage.updateRequest(request);
	}
}
