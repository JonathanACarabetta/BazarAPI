package com.miapplication.BazarAPI.DTO;

import com.miapplication.BazarAPI.Model.Product;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class CreateSellDTO {
    private Double total;
    private List<Product> productList;

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
}
