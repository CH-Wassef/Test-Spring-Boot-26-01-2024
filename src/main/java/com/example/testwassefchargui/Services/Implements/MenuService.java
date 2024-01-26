package com.example.testwassefchargui.Services.Implements;


import com.example.testwassefchargui.Entities.Menu;
import com.example.testwassefchargui.Services.Impl.IMenuService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service("MenuServiceImpl")
@AllArgsConstructor
public class MenuService implements IMenuService {
    @Override
    public List<Menu> getAllMenu() {
        return null;
    }

    @Override
    public Menu addMenu(Menu menu) {
        return null;
    }

    @Override
    public void removeMenu(long id) {

    }

    @Override
    public Menu modifyMenu(Menu menu, long id) {
        return null;
    }
}
