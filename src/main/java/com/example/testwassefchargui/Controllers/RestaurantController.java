package com.example.testwassefchargui.Controllers;

import com.example.testwassefchargui.Entities.Client;
import com.example.testwassefchargui.Entities.Restaurant;
import com.example.testwassefchargui.Services.Impl.IClientService;
import com.example.testwassefchargui.Services.Impl.IRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Restaurant")
public class RestaurantController {
    @Autowired
    IRestaurantService iRestaurantService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Restaurant>> getAllRestaurant(){
        List<Restaurant> restaurants= iRestaurantService.getAllRestaurant();
        return new ResponseEntity<>(restaurants, HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Restaurant> addRestaurant(@RequestBody Restaurant restaurant){
        Restaurant addedRestaurant = iRestaurantService.addRestaurant(restaurant);
        return new ResponseEntity<>(addedRestaurant, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRestaurant(@PathVariable long id){
        iRestaurantService.removeRestaurant(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Restaurant> modifyRestaurant(@RequestBody Restaurant restaurant, @PathVariable long id){
        Restaurant modifyRestaurant = iRestaurantService.modifyRestaurant(restaurant, id);
        return new ResponseEntity<>(modifyRestaurant, HttpStatus.ACCEPTED);
    }
}
