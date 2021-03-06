package com.tts.swaggerpractice.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;


public class ItemV1 {

        @ApiModelProperty(notes = "The name of the Menu ItemV1")
        private String name;
        @ApiModelProperty(notes = " description of the Menu ItemV1")
        private String description;
        @ApiModelProperty(notes = "The category of the Menu ItemV1 (appetizer, entree,dessert,etc )")
        private String category;
        @ApiModelProperty(notes = "Ingredients of the Menu ItemV1")
        private List<String> ingredients;
        @ApiModelProperty(notes = "Price of the Menu ItemV1")
        private double price;
        @ApiModelProperty(notes = "Created On")
        private Date createdDate;
        @ApiModelProperty(notes = "Last Updated on")
        private Date updatedDate;

    public ItemV1(String name, String description, String category, List<String> ingredients, double price, Date createdDate, Date updatedDate) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.ingredients = ingredients;
        this.price = price;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public ItemV1() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
