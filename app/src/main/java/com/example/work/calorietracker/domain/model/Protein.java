package com.example.work.calorietracker.domain.model;

/**
 * Created by Karol Zdebel on 5/28/2017.
 */

public class Protein extends Macronutrient {

    private static int CALORIES_PER_PROTEIN = 4;

    public Protein(int count){
        super(count);
    }

    @Override
    public int getCaloricValue(){
        return count*CALORIES_PER_PROTEIN;
    }

}
