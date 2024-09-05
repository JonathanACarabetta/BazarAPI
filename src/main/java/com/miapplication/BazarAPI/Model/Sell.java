package com.miapplication.BazarAPI.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

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

    public Long getId_sell() {
        return id_sell;
    }

    public void setId_sell(Long id_sell) {
        this.id_sell = id_sell;
    }

    public LocalDate getDay_sell() {
        return day_sell;
    }

    public void setDay_sell(LocalDate day_sell) {
        this.day_sell = day_sell;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
