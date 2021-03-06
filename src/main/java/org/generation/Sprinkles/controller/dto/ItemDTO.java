package org.generation.Sprinkles.controller.dto;

public class ItemDTO {

    private String name;
    private String category;
    private double price;
    private String description;
    private String imageUrl;

    public ItemDTO(String name,String category, double price, String description, String imageUrl)
    {
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
/*
    public String getName() {return name;}

    public void setName(String Name){this.name = name; }

    public String getDescription() {return description;}

    public void setDescription(String description){this.description = description;}

    public String getImageUrl() {return imageUrl;}

    public void setImageUrl(String imageUrl){this.imageUrl=imageUrl;}

    public double getPrice(){ return price;}

    public void setPrice(double price) {this.price = price;}

    public String getCategory() {return category;}

    public void setCategory(String category){this.category=category;}*/
}