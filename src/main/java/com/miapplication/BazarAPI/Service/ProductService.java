package com.miapplication.BazarAPI.Service;

import com.miapplication.BazarAPI.DTO.CreateProductDTO;
import com.miapplication.BazarAPI.Model.Product;

import java.util.List;

public class ProductService implements IProductService{
    @Override
    public List<Product> getProducts() {
        return List.of();
    }

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public void saveProduct(CreateProductDTO createProduct) {

    }

    @Override
    public Product editProduct(CreateProductDTO editProduct, Long id) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
