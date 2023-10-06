package com.example;

import java.util.ArrayList;

public class Basket {
    private int capacity;
    private ArrayList<Fruit> fruits;

    public Basket(int capacity) {
        // TODO: Initialize the attributes (and initialize the fruits list)
        this.capacity = capacity;
        this.fruits = new ArrayList<Fruit>();
    }

    public void addFruit(Fruit fruit) {
        // TODO: Add the fruit to the basket IF THERE IS SPACE!
        if (this.fruits.size() < this.capacity){
            this.fruits.add(fruit);
        }
       
    }

    public void removeFruit(Fruit fruit) {
        // TODO: Remove the fruit from the basket
        removeFruit(fruit);
    }

    // TODO: Implement getters, setters, and any other methods you find necessary
    public int getCapacity(){
        return this.capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setFruits(Fruit fruits){
        this.fruits = Fruit fruits;

    }
    public String getFruits(){
        return fruits;
    }
}



