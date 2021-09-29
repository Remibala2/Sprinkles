package org.generation.Sprinkles.repository.entity;


import org.generation.Sprinkles.controller.dto.ItemDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Repository is the model layer
//JPA (Java Persistence API) map Java Objects (Class) to the database tables
//This concept is known as ORM(Object Relational Mapping)
//Item is an entity that will be used to map with the Item table in the database
//E.g if you have a category table, then you have to create another entity
//1 table = 1 entity

@Entity
public class Item {
    //Table columns is the item attributes of the class
    //Database is responsible for auto generating the primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String category;
    private double price;
    private String description;
    private String imageUrl;


    public Item() {
    }

    public Item(ItemDTO itemDTO) {
        this.name = itemDTO.getName();
        this.category = itemDTO.getCategory();
        this.price = itemDTO.getPrice();
        this.description = itemDTO.getDescription();
        this.imageUrl = itemDTO.getImageUrl();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

        return "/productImages/" + imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}