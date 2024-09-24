package com.miapplication.BazarAPI.Repository;

import com.miapplication.BazarAPI.Model.Sell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface SellRepository extends JpaRepository<Sell, Long> {
    @Query("SELECT * FROM Sell ORDER BY total DESC LIMIT 1")
    Sell findSellWithMayorTotal();

    List<Sell> findByDate(Date day_sell);
}
