package com.example.testwassefchargui.Controllers;

import com.example.testwassefchargui.Entities.Client;
import com.example.testwassefchargui.Entities.Composant;
import com.example.testwassefchargui.Services.Impl.IClientService;
import com.example.testwassefchargui.Services.Impl.IComposantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Client")
public class ClientController {
    @Autowired
    IClientService iClientService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Client>> getAllClient(){
        List<Client> clients= iClientService.getAllClient();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Client> addClient(@RequestBody Client client){
        Client addedClient = iClientService.addClient(client);
        return new ResponseEntity<>(addedClient, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable long id){
        iClientService.removeClient(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Client> modifyClient(@RequestBody Client client, @PathVariable long id){
        Client modifyComposant = iClientService.modifyClient(client, id);
        return new ResponseEntity<>(modifyComposant, HttpStatus.ACCEPTED);
    }

}

