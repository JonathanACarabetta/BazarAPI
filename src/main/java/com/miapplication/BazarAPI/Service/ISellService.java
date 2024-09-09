package com.miapplication.BazarAPI.Service;

import com.miapplication.BazarAPI.DTO.CreateSellDTO;
import com.miapplication.BazarAPI.Model.Sell;

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
}
