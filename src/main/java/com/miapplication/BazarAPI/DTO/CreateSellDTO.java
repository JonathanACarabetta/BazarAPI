package com.miapplication.BazarAPI.DTO;

import com.miapplication.BazarAPI.Model.Product;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateSellDTO {
    private Double total;
    private List<Product> productList;
}
