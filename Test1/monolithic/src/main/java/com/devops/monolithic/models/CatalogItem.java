package com.devops.monolithic.models;

public class CatalogItem {
    private String name;
    private String category;
    private int rating;
        
    
    public CatalogItem(String name, String category, int rating) {
        this.name = name;
        this.category = category;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    



}
