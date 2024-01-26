package com.example.testwassefchargui.Services.Implements;


import com.example.testwassefchargui.Controllers.ComposantController;
import com.example.testwassefchargui.Entities.Composant;
import com.example.testwassefchargui.Repository.ComposantRepository;
import com.example.testwassefchargui.Services.Impl.IComposantService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service("IComposantService")
@AllArgsConstructor
public class ComposantService implements IComposantService {
  ComposantRepository composantRepository;

    @Override
    public List<Composant> getAllComposant() {
        return null;
    }

    @Override
    public Composant addComposant(Composant composant) {
        return null;
    }

    @Override
    public void removeComposant(long id) {

    }

    @Override
    public Composant modifyComposant(Composant composant, long id) {
        return null;
    }
}
