package com.miapplication.BazarAPI.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class SellsOfTheDayDTO {

    private Double total;
    private int totalOfSells;
}
