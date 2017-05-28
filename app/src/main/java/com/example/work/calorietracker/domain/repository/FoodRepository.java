package com.example.work.calorietracker.domain.repository;

import com.example.work.calorietracker.domain.model.Food;

import java.util.ArrayList;

/**
 * Created by Karol Zdebel on 5/28/2017.
 */

public class FoodRepository implements BaseRepository<Food> {
    ArrayList<Food> food;

    public void FoodRepository(){
        food = new ArrayList<>();
    }

    @Override
    public boolean update(Food model) {
        return false; //No implementation
    }

    @Override
    public boolean put(Food model) {
        food.add(model);
        return true;
    }

    @Override
    public boolean remove(Food model) {
        return food.remove(model);
    }

    @Override
    public Food get(String id) {
        for (Food f: food){
            if (f.getName().equals(id)){
                return f;
            }
        }

        return null;
    }
}
