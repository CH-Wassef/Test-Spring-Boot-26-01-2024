package com.example.testwassefchargui.Services.Impl;

import com.example.testwassefchargui.Entities.Menu;

import java.util.List;

public interface IMenuService {
    List<Menu> getAllMenu();
    Menu addMenu(Menu menu);
    void removeMenu(long id);
    Menu modifyMenu(Menu menu, long id);
}
