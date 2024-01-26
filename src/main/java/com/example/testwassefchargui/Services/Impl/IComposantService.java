package com.example.testwassefchargui.Services.Impl;

import com.example.testwassefchargui.Entities.Composant;

import java.util.List;

public interface IComposantService {
    List<Composant> getAllComposant();
    Composant addComposant(Composant composant);
    void removeComposant(long id);
    Composant modifyComposant(Composant composant, long id);
}
