package com.miapplication.BazarAPI.Service;

import com.miapplication.BazarAPI.DTO.CreateSellDTO;
import com.miapplication.BazarAPI.Model.Product;
import com.miapplication.BazarAPI.Model.Sell;
import com.miapplication.BazarAPI.Repository.SellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SellService implements ISellService{

    @Autowired SellRepository sellRepository;
    @Autowired IProductService productService;
    @Override
    public List<Sell> getSells() {
        return sellRepository.findAll();
    }

    @Override
    public Sell getSellById(Long id) {
        return sellRepository.findById(id).orElse(null);
    }

    @Override
    public Sell saveSell(CreateSellDTO createSellDTO) {
        Sell sell = new Sell();
        sell.setDay_sell(LocalDate.now());
        sell.setDeleted(false);
        sell.setClient(createSellDTO.getClient());
        sell.setProductList(createSellDTO.getProductList());
        sell.setTotal(createSellDTO.getTotal());
        return  sellRepository.save(sell);
    }

    @Override
    public Sell editSell(CreateSellDTO editSellDTO, Long id) {
        Sell editSell = this.getSellById(id);
        editSell.setTotal(editSellDTO.getTotal());
        editSell.setProductList(editSellDTO.getProductList());
        editSell.setClient(editSellDTO.getClient());
        sellRepository.save(editSell);
        return editSell;
    }

    @Override
    public void deleteSell(Long id) {
        sellRepository.deleteById(id);
    }
}
