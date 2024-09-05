package com.miapplication.BazarAPI.Service;

import com.miapplication.BazarAPI.DTO.CreateSellDTO;
import com.miapplication.BazarAPI.Model.Sell;
import com.miapplication.BazarAPI.Repository.SellRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SellService implements ISellService{

    @Autowired SellRepository sellRepository;

    @Override
    public List<Sell> getSells() {
        return sellRepository.findAll();
    }

    @Override
    public Sell getSellById(Long id) {
        return sellRepository.findById(id).orElse(null);
    }

    @Override
    public void saveSell(CreateSellDTO createSellDTO) {
        //activate this methot when i have all the others Cruds done
    }

    @Override
    public Sell editSell(CreateSellDTO editSellDTO, Long id) {
        Sell editSell = this.getSellById(id);
        editSell.setTotal(editSellDTO.getTotal());
        editSell.setProductList(editSellDTO.getProductList());
        sellRepository.save(editSell);
        return editSell;
    }

    @Override
    public void deleteSell(Long id) {
        sellRepository.deleteById(id);
    }
}
