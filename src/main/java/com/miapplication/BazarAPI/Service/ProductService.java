package com.miapplication.BazarAPI.Service;

import com.miapplication.BazarAPI.DTO.CreateProductDTO;
import com.miapplication.BazarAPI.Model.Product;
import com.miapplication.BazarAPI.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product saveProduct(CreateProductDTO createProduct) {
        Product p = new Product();
        p.setName(createProduct.getName());
        p.setBrand(createProduct.getBrand());
        p.setCost(createProduct.getCost());
        p.setStock(createProduct.getStock());
        p.setDeleted(false);
        return productRepository.save(p);
    }

    @Override
    public Product editProduct(CreateProductDTO editProduct, Long id) {
        Product p = this.getProductById(id);
        p.setName(editProduct.getName());
        p.setBrand(editProduct.getBrand());
        p.setCost(editProduct.getCost());
        p.setStock(editProduct.getStock());
        p.setDeleted(false);
        return productRepository.save(p);
    }

    @Override
    public void deleteProduct(Long id) {
        Product p = this.getProductById(id);
        p.setDeleted(true);
    }

    @Override
    public List<Product> lessThanFive() {
        List<Product> products = productRepository.lessThan5();
        return products;
    }
}
