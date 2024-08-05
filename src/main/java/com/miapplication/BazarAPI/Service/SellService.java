package com.miapplication.BazarAPI.Service;

import com.miapplication.BazarAPI.DTO.CreateSellDTO;
import com.miapplication.BazarAPI.Model.Sell;

import java.util.List;

public class SellService implements ISellService{
    @Override
    public List<Sell> getSells() {
        return List.of();
    }

    @Override
    public Sell getSellById(Long id) {
        return null;
    }

    @Override
    public void saveSell(CreateSellDTO createSellDTO) {

    }

    @Override
    public Sell editSell(CreateSellDTO editSellDTO, Long id) {
        return null;
    }

    @Override
    public void deleteSell(Long id) {

    }
}
