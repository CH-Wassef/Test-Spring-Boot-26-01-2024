package com.example.testwassefchargui.Services.Implements;

import com.example.testwassefchargui.Entities.Client;
import com.example.testwassefchargui.Services.Impl.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service("ClientServiceImpl")
@AllArgsConstructor
public class ClientService implements IClientService {
    @Override
    public List<Client> getAllClient() {
        return null;
    }

    @Override
    public Client addClient(Client client) {
        return null;
    }

    @Override
    public void removeClient(long id) {

    }

    @Override
    public Client modifyClient(Client client, long id) {
        return null;
    }
}
