package com.assignment2.assignment2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.assignment2.assignment2.models.HelpRequest;
import com.assignment2.assignment2.services.HelpRequestService;

@RestController
@RequestMapping("/api/v1/helpme")
public class HelpRequestController {

	@Autowired
    private HelpRequestService requestService;
    
    @GetMapping(path = "/", produces = "application/json")
    public List<HelpRequest> getHelpRequests() {
        return requestService.getRequests();
    }
    
    @GetMapping(path = "/{type}", produces = "application/json")
    public List<HelpRequest> getHelpRequests(@PathVariable String type) {
		try
		{
			return requestService.getRequestByType(type);
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
    }
    
    @RequestMapping(value="/", method=RequestMethod.POST, produces = "application/json")
    public HelpRequest createRequest(@RequestBody HelpRequest request) {
			try {
				int id = requestService.add(request);
				return requestService.getRequest(id);
			} catch (Exception e) {
				throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
			}
    }

}