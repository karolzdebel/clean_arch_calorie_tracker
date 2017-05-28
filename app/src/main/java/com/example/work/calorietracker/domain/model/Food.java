package com.example.work.calorietracker.domain.model;

/**
 * Created by Karol Zdebel on 5/28/2017.
 */

public class Food {

    private String name;
    private Carbohydrate carb;
    private Fat fat;
    private Protein protein;

    public Food(String name, int carbCount, int fatCount, int proteinCount){
        this.name = name;
        this.carb = new Carbohydrate(carbCount);
        this.fat = new Fat(fatCount);
        this.protein = new Protein(proteinCount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCarb(){
        return carb.getCount();
    }

    public int getTotalFat(){
        return fat.getCount();
    }

    public int getTotalProtein(){
        return protein.getCount();
    }

    public int getCalorieCount(){
        return carb.getCaloricValue()+fat.getCaloricValue()+protein.getCaloricValue();
    }


}
