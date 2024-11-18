package com.eletronicocg.eletronico.controller;

import com.eletronicocg.eletronico.entity.Item;
import com.eletronicocg.eletronico.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/items")
public class itemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public Optional<Item> getItemById(@PathVariable long id){
        return itemService.getItemById(id);
    }

    @PostMapping
    public Item createItem(@RequestBody Item item){
        return itemService.createItem(item);
    }

    @PostMapping("/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item itemDetails){
        return itemService.updateItem(id, itemDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id){
        itemService.deleteItem(id);
    }
}
