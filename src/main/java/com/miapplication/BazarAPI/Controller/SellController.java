package com.miapplication.BazarAPI.Controller;

import com.miapplication.BazarAPI.DTO.CreateSellDTO;
import com.miapplication.BazarAPI.Model.Sell;
import com.miapplication.BazarAPI.Service.ISellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sells")
public class SellController {

    @Autowired
    ISellService sellService;

    @GetMapping("")
    public List<Sell> getSells (){
        List<Sell> sells = sellService.getSells();
        return sells;
    }

    @GetMapping("/{id}")
    public Sell getSellById(@PathVariable Long id){
        Sell sell = sellService.getSellById(id);
        return sell;
    }

    @PostMapping("/create")
    public Sell saveSell(@RequestBody CreateSellDTO createSellDTO){
        Sell sell = sellService.saveSell(createSellDTO);
        return sell;
    }

    @PutMapping("/edit/{id}")
    public Sell editSell(@RequestBody CreateSellDTO createSellDTO,@PathVariable Long id){
        Sell sell = sellService.editSell(createSellDTO,id);
        return sell;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSellById(@PathVariable Long id){
        sellService.deleteSell(id);
        return "Venta con id "+id+" eliminada correctamente";
    }

}
