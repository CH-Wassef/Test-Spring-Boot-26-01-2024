package com.example.testwassefchargui.Services.Impl;

import com.example.testwassefchargui.Entities.Client;

import java.util.List;

public interface IClientService {
    List<Client> getAllClient();
    Client addClient(Client client);
    void removeClient(long id);
    Client modifyClient(Client client, long id);
}
