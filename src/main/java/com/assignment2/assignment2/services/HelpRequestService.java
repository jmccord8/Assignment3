package com.assignment2.assignment2.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment2.assignment2.models.HelpRequest;
import com.assignment2.assignment2.repositories.HelpRequestRepo;

@Service
public class HelpRequestService {
	
	@Autowired
	private HelpRequestRepo hrRepo;
	
	public List<HelpRequest> getRequests(){
		return hrRepo.getRequests();
	}
	
	public List<HelpRequest> getRequestByType(String type) {
		return hrRepo.getRequestByType(type);
	}
	
	public HelpRequest getRequest(int id) throws Exception
	{
		if(id > 0) {
			return hrRepo.getRequest(id);
		}
		throw new Exception("Request doesn't exist");
		
	}
	
	public String getRequesterName(int id) throws Exception
	{
		if(id > 0) {
			return hrRepo.getRequesterName(id);
		}
		throw new Exception("Request doesn't exist");
		
	}
	
	public Date getRequestDate(int id) throws Exception
	{
		if(id > 0) {
			return hrRepo.getRequestDate(id);
		}
		throw new Exception("Request doesn't exist");
		
	}
	
	public int add(HelpRequest request) {
		return hrRepo.add(request);
	}
	
	public void remove(HelpRequest request) {
		hrRepo.remove(request);
	}
	
	public void updateRequest(HelpRequest request)
	{
		hrRepo.updateRequest(request);
	}
}
