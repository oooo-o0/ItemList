package com.example.app.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.app.domain.Item;

@Service
public class ItemService {
    private List<Item> itemList;
    public ItemService() {
        itemList = new ArrayList<>();
        itemList.add(new Item("マウス", 1800, LocalDate.of(2025, 1, 1)));
        itemList.add(new Item("キーボード", 5980, LocalDate.of(2025, 1, 1)));
        itemList.add(new Item("モニター", 19800, LocalDate.of(2025, 1, 1)));
        itemList.add(new Item("PC", 147800, LocalDate.of(2025, 2, 1)));
        itemList.add(new Item("スマートフォン", 78200, LocalDate.of(2025, 2, 1)));
        itemList.add(new Item("カメラ", 14800, LocalDate.of(2025, 2, 15)));
        itemList.add(new Item("USBメモリ", 2980, LocalDate.of(2025, 3, 1)));
    }
    public List<Item> getItemList() {
        return itemList;
    }
    public Item getItemById(int id) {
        return itemList.get(id);
    }
}

