package com.miapplication.BazarAPI.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class SellClientDTO {
    private Long sell_code;
    private double total;
    private int products;
    private String clientName;
    private String clientLastName;

}
