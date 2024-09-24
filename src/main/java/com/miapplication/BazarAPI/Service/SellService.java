package com.miapplication.BazarAPI.Service;

import com.miapplication.BazarAPI.DTO.CreateSellDTO;
import com.miapplication.BazarAPI.DTO.SellClientDTO;
import com.miapplication.BazarAPI.DTO.SellsOfTheDayDTO;
import com.miapplication.BazarAPI.Model.Product;
import com.miapplication.BazarAPI.Model.Sell;
import com.miapplication.BazarAPI.Repository.SellRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class SellService implements ISellService{

    private static final Logger log = LoggerFactory.getLogger(SellService.class);
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

    @Override
    public List<Product> productsBySell(Long id) {
        Sell sell = this.getSellById(id);
        return sell.getProductList();
    }

    @Override
    public SellClientDTO getDataFromMayorSell() {
        Sell sell = sellRepository.findSellWithMayorTotal();
        SellClientDTO sellCliDto = new SellClientDTO();
        sellCliDto.setSell_code(sell.getId_sell());
        sellCliDto.setTotal(sell.getTotal());
        sellCliDto.setProducts(sell.getProductList().size());
        sellCliDto.setClienName(sell.getClient().getName());
        sellCliDto.setClientLastName(sell.getClient().getLastName());
        return sellCliDto;
    }

    @Override
    public SellsOfTheDayDTO getSellsOfOneDay(LocalDate day) {
        List<Sell> sells = sellRepository.findByDate(Date.from(day.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        SellsOfTheDayDTO daySells = new SellsOfTheDayDTO();
        for (int i=0;i<=sells.size()-1;i++){
            daySells.setTotal(sells.get(i).getTotal()+daySells.getTotal());
        }
        daySells.setTotalOfSells(sells.size());
        return daySells;
    }


}
