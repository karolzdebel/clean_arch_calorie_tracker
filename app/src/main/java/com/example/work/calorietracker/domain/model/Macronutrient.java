package com.example.work.calorietracker.domain.model;

/**
 * Created by Karol Zdebel on 5/28/2017.
 */

public abstract class Macronutrient {

    protected int count;

    public Macronutrient(int count){
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    abstract public int getCaloricValue();

}
