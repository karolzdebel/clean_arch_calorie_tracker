package com.example.work.calorietracker.domain.model;

/**
 * Created by Karol Zdebel on 5/28/2017.
 */

public class Fat extends Macronutrient{

    private final int CALORIES_PER_FAT = 9;

    public Fat(int count){
        super(count);
    }

    public int getCaloricValue(){
        return count*CALORIES_PER_FAT;
    }
}
