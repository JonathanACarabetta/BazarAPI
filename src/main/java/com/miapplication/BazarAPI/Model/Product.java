package com.miapplication.BazarAPI.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    private Long id_product;
    private String name;
    private String brand;
    private Double cost;
    private int stock;
    @ManyToOne
    @JoinColumn(name="id_sell")
    private Sell sell;
    private boolean isDeleted;
}
