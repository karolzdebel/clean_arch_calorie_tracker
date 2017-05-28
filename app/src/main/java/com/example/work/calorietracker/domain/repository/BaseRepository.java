package com.example.work.calorietracker.domain.repository;

/**
 * Created by Karol Zdebel on 5/28/2017.
 */

public interface BaseRepository<T> {
    boolean update(T model);
    boolean put(T model);
    boolean remove(T model);
    T get(String id);
}
