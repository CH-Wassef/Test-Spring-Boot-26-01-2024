package com.example.testwassefchargui.Services.Implements;

import com.example.testwassefchargui.Entities.Restaurant;
import com.example.testwassefchargui.Services.Impl.IRestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service("RestaurantServiceImpl")
@AllArgsConstructor
public class RestaurantService implements IRestaurantService {
    @Override
    public List<Restaurant> getAllRestaurant() {
        return null;
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return null;
    }

    @Override
    public void removeRestaurant(long id) {

    }

    @Override
    public Restaurant modifyRestaurant(Restaurant restaurant, long id) {
        return null;
    }
}
