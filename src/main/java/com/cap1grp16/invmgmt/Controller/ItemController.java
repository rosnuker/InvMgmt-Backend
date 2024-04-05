package com.cap1grp16.invmgmt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap1grp16.invmgmt.Entity.ItemEntity;
import com.cap1grp16.invmgmt.Service.ItemService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ItemController {

    @Autowired
    ItemService iserv;

    @PostMapping("/addItem")
    public ItemEntity addItem(@RequestBody ItemEntity item) {
        return iserv.addItem(item);
    }

    @GetMapping("/getAllItems")
    public List<ItemEntity> getAllItems() {
        return iserv.getAllItems();
    }
    
}
