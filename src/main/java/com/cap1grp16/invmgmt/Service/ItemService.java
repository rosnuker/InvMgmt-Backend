package com.cap1grp16.invmgmt.Service;

import java.util.List;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap1grp16.invmgmt.Entity.ItemEntity;
import com.cap1grp16.invmgmt.Repository.ItemRepository;

@Service
public class ItemService {

    @Autowired
    ItemRepository irepo;

    public ItemEntity addItem(LocalDate date, ItemEntity item) {
        item.setInvoiceDate(date);

        return irepo.save(item);
    }

    public List<ItemEntity> getAllItems() {
        return irepo.findAll();
    }
    
}
