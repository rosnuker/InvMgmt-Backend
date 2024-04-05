package com.cap1grp16.invmgmt.Controller;

import java.util.List;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cap1grp16.invmgmt.Entity.ItemEntity;
import com.cap1grp16.invmgmt.Service.ItemService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ItemController {

    @Autowired
    ItemService iserv;

    @PostMapping("/addItem")
    public ItemEntity addItem(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date, @RequestBody ItemEntity item) {
        return iserv.addItem(date, item);
    }

    @GetMapping("/getAllItems")
    public List<ItemEntity> getAllItems() {
        return iserv.getAllItems();
    }
    
}
