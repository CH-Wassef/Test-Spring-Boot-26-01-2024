package com.example.testwassefchargui.Repository;

import com.example.testwassefchargui.Entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
}
