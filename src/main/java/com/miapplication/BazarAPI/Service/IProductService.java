package com.miapplication.BazarAPI.Service;

import com.miapplication.BazarAPI.DTO.CreateProductDTO;
import com.miapplication.BazarAPI.Model.Product;

import java.util.List;

public interface IProductService {
    /**Get all Products*/
    public List<Product> getProducts();
    /** Get one product by id*/
    public Product getProductById(Long id);
    /** Create one product using createProductDTO*/
    public void saveProduct(CreateProductDTO createProduct);
    /** Edit one Product using an existing id and createProductDTO info*/
    public Product editProduct(CreateProductDTO editProduct, Long id);
    /** Softdelete of one product using an existing id*/
    public void deleteProduct(Long id);

}
