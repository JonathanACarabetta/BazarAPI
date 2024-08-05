package com.miapplication.BazarAPI.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductDTO {
    private String name;
    private String brand;
    private Double cost;
    private int stock;

}
