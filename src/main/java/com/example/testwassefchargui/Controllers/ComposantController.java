package com.example.testwassefchargui.Controllers;

import com.example.testwassefchargui.Entities.Composant;
import com.example.testwassefchargui.Services.Impl.IComposantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Composant")
public class ComposantController {

    @Autowired
    IComposantService iComposantService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Composant>> getAllComposant(){
        List<Composant> composant = iComposantService.getAllComposant();
        return new ResponseEntity<>(composant, HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Composant> addComposant(@RequestBody Composant composant){
        Composant addedComposant = iComposantService.addComposant(composant);
        return new ResponseEntity<>(addedComposant, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteComposant(@PathVariable long id){
        iComposantService.removeComposant(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Composant> modifyBlock(@RequestBody Composant composant, @PathVariable long id){
        Composant modifyComposant = iComposantService.modifyComposant(composant, id);
        return new ResponseEntity<>(modifyComposant, HttpStatus.ACCEPTED);
    }

}
