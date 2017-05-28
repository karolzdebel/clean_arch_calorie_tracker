package com.example.work.calorietracker.domain.model;

/**
 * Created by Karol Zdebel on 5/28/2017.
 */

public class Carbohydrate extends Macronutrient {

    public final int CALORIES_PER_CARBOHYDRATE = 4;

    public Carbohydrate(int count){
        super(count);
    }

    public int getCaloricValue(){
        return count*CALORIES_PER_CARBOHYDRATE;
    }
}
