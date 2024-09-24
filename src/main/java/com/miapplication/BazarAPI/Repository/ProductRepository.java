package com.miapplication.BazarAPI.Repository;

import com.miapplication.BazarAPI.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT * FROM Product p Where p.stock < 5")
    List<Product> lessThan5();
}
