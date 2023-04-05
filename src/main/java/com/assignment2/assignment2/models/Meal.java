package com.assignment2.assignment2.models;

public class Meal {
    private int id;
    private String type;
    private String combo;
    
    public Meal() {
    	
    }

    public Meal(int id, String type, String combo) {
        this.id = id;
        this.type = type;
        this.combo = combo;
    }

    public Meal(String type, String combo) {
        this.type = type;
        this.combo = combo;
    }
    
    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getCombo() {
        return combo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCombo(String combo) {
        this.combo = combo;
    }
}



