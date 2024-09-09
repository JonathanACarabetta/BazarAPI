package com.miapplication.BazarAPI.Controller;

import com.miapplication.BazarAPI.DTO.CreateProductDTO;
import com.miapplication.BazarAPI.Model.Product;
import com.miapplication.BazarAPI.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    IProductService productService;

    @GetMapping("")
    public List<Product> getProducts (){
        return  productService.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById (@PathVariable Long id){
        return productService.getProductById(id);
    }

    @PostMapping("/create")
    public Product saveProduct(@RequestBody CreateProductDTO createProductDTO){
        return  productService.saveProduct(createProductDTO);
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@RequestBody CreateProductDTO createProductDTO, @PathVariable Long id){
        return  productService.editProduct(createProductDTO, id);
    }



}
