package com.assignment2.assignment2.models;

import java.util.Date;

public class HelpRequest {
    private String requesterName;
    private Date requestedAt;
    private String type;
    private Date fulfilledAt;
    private int id;
    
    public HelpRequest(){
    	
    }
    
    public HelpRequest(int id, String requesterName, Date requestedAt, String type) {
    	this.id = id;
        this.requesterName = requesterName;
        this.requestedAt = requestedAt;
        this.type = type;
    }

    public HelpRequest(String requesterName, Date requestedAt, String type) {
    	this.id = 0;
        this.requesterName = requesterName;
        this.requestedAt = requestedAt;
        this.type = type;
    }

    public String getRequesterName() {
        return requesterName;
    }

    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
    }

    public Date getRequestedAt() {
        return requestedAt;
    }

    public void setRequestedAt(Date requestedAt) {
        this.requestedAt = requestedAt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getFulfilledAt() {
        return fulfilledAt;
    }

    public void setFulfilledAt(Date fulfilledAt) {
        this.fulfilledAt = fulfilledAt;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
