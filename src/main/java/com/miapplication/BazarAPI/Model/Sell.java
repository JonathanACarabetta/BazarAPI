package com.miapplication.BazarAPI.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Entity
public class Sell {
    private Long id_sell;
    private LocalDate day_sell;
    private Double total;
    @OneToMany(mappedBy = "sell")
    private List<Product> productList;
    @ManyToOne
    @JoinColumn(name="id_client")
    private Client client;
    private boolean isDeleted;
}
