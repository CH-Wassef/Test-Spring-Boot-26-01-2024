package com.example.testwassefchargui.Controllers;

import com.example.testwassefchargui.Entities.Composant;
import com.example.testwassefchargui.Entities.Menu;
import com.example.testwassefchargui.Services.Impl.IComposantService;
import com.example.testwassefchargui.Services.Impl.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Menu")
public class MenuController {

    @Autowired
    IMenuService iMenuService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Menu>> getAllMenu(){
        List<Menu> menus = iMenuService.getAllMenu();
        return new ResponseEntity<>(menus, HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Menu> addMenu(@RequestBody Menu menu){
        Menu addedMenu = iMenuService.addMenu(menu);
        return new ResponseEntity<>(addedMenu, HttpStatus.CREATED);
    }

}
