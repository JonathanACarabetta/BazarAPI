package com.miapplication.BazarAPI.Repository;

import com.miapplication.BazarAPI.Model.Sell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellRepository extends JpaRepository<Sell, Long> {
}
