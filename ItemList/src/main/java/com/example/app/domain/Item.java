package com.example.app.domain;

import java.time.LocalDate;



import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private String name;
    private Integer price;
    private LocalDate registered;
}
