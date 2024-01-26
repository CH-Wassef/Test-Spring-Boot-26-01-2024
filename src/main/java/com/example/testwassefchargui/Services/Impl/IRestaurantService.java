package com.example.testwassefchargui.Services.Impl;

import com.example.testwassefchargui.Entities.Restaurant;

import java.util.List;

public interface IRestaurantService {

    List<Restaurant> getAllRestaurant();
    Restaurant addRestaurant(Restaurant restaurant);
    void removeRestaurant(long id);
    Restaurant modifyRestaurant(Restaurant restaurant, long id);
}
