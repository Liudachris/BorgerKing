package com.example.borgerking;

public class Food {

    private int foodID;

    private String foodName;

    private int foodPrice;

    private int foodQuantity;

    private String foodDesc;

    private int imageID;

    public int getFoodID() { return foodID; }

    public void setFoodID(int foodID) { this.foodID = foodID; }

    public String getFoodName() { return foodName; }

    public void setFoodName(String foodName) { this.foodName = foodName; }

    public int getFoodQuantity() { return foodQuantity; }

    public void setFoodQuantity(int foodQuantity) { this.foodQuantity = foodQuantity; }

    public int getFoodPrice() { return foodPrice; }

    public void setFoodPrice(int foodPrice) { this.foodPrice = foodPrice; }

    public String getFoodDescription() { return foodDesc; }

    public void setFoodDesc(String foodDesc) { this.foodDesc = foodDesc; }

    public int getImageDrawableId() { return imageID; }

    public void setImageID(int imageDrawableId) { this.imageID = imageDrawableId; }

    public Food(int foodID, String foodName, int foodPrice, int foodQuantity, String foodDesc, int imageID){
        this.foodID = foodID;
        this.foodName = foodName;
        this.foodQuantity = foodQuantity;
        this.foodPrice = foodPrice;
        this.foodDesc = foodDesc;
        this.imageID = imageID;
    }
}
