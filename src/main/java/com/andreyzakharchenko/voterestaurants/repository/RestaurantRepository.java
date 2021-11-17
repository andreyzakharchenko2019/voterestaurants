package com.andreyzakharchenko.voterestaurants.repository;

import com.andreyzakharchenko.voterestaurants.model.Restaurant;

import java.util.List;

public interface RestaurantRepository {

    Restaurant save(Restaurant meal, int userId);

    boolean delete(int id, int userId);

    Restaurant get(int id, int userId);

    List<Restaurant> getAll(int userId);
}