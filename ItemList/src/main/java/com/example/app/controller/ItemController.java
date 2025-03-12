package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.app.domain.Item;
import com.example.app.service.ItemService;

import lombok.RequiredArgsConstructor;



@Controller
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService service;
    @GetMapping
    public String list(Model model) {
        model.addAttribute("itemList", service.getItemList());
        model.addAttribute("title", "商品一覧");
        return "list";
    }
    @GetMapping("/{id}")
    public String show( 
        @PathVariable Integer id, Model model) {
            Item item = service.getItemById(id);
            model.addAttribute("item", item);
            model.addAttribute("title", item.getName());
            return "show";
        
        }
    
    
}
