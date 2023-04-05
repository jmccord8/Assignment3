package com.assignment2.assignment2.storage;

import java.util.ArrayList;
import java.util.Date;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import com.assignment2.assignment2.models.HelpRequest;

public class HelpRequestStorage {
	Dictionary<Integer,HelpRequest> requests = new Hashtable<>();
	
	public List<HelpRequest> getRequests(){
		List<HelpRequest> allRequests = new ArrayList<>();
        Enumeration<Integer> e = requests.keys();
        while(e.hasMoreElements()) {
            Integer k = e.nextElement();
            allRequests.add(requests.get(k));
        }
        return allRequests;
	}
	
	public List<HelpRequest> getRequestByType(String type) {
		List<HelpRequest> requestTypes = new ArrayList<HelpRequest>();
        Enumeration<Integer> e = requests.keys();
        while(e.hasMoreElements()) {
            Integer k = e.nextElement();
            if(requests.get(k).getType().equalsIgnoreCase(type)) {
            	requestTypes.add(requests.get(k));
            }
        }
		return requestTypes;
	}
	
	public HelpRequest getRequest(int id)
	{
		return requests.get(id);
	}
	
	public String getRequesterName(int id)
	{
		return requests.get(id).getRequesterName();
	}
	
	public Date getRequestDate(int id)
	{
		return requests.get(id).getRequestedAt();
	}
	
	public int add(HelpRequest request) {
		int newID = requests.size() + 1;
		request.setId(newID);
		requests.put(request.getId(), request);

		return request.getId();
	}
	
	public void remove(HelpRequest request) {
		requests.remove(request.getId());
	}
	
	public void updateRequest(HelpRequest request)
	{
		requests.remove(request.getId());
		requests.put(request.getId(), request);
	}
}
