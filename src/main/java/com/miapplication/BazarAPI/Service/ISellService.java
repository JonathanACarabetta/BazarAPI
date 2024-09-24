package com.miapplication.BazarAPI.Service;

import com.miapplication.BazarAPI.DTO.CreateSellDTO;
import com.miapplication.BazarAPI.DTO.SellClientDTO;
import com.miapplication.BazarAPI.DTO.SellsOfTheDayDTO;
import com.miapplication.BazarAPI.Model.Product;
import com.miapplication.BazarAPI.Model.Sell;

import java.time.LocalDate;
import java.util.List;

public interface ISellService {
    /**Get all Sells*/
    public List<Sell> getSells();
    /** Get one Sell by Id*/
    public Sell getSellById(Long id);
    /** Create one Sell using info in CreateSellDTO*/
    public Sell saveSell(CreateSellDTO createSellDTO);
    /** Edit one existing Sell using info in editSellDTO and Id*/
    public Sell editSell(CreateSellDTO editSellDTO, Long id);
    /** SoftDelete of one Sell using an existing Id*/
    public void deleteSell(Long id);

    /**Get products of One Sell By Id */
    public List<Product> productsBySell(Long id);

    /** Get data of the mayor sell*/
    public SellClientDTO getDataFromMayorSell();

    /** Get Data From All Sells in one day*/
    public SellsOfTheDayDTO getSellsOfOneDay(LocalDate day);
}
