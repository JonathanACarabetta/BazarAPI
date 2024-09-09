package com.miapplication.BazarAPI.Controller;

import com.miapplication.BazarAPI.DTO.CreateClientDTO;
import com.miapplication.BazarAPI.Model.Client;
import com.miapplication.BazarAPI.Service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
public class ClientController {

    @Autowired
    IClientService clientService;
    @GetMapping("")
    public List<Client> getClients (){
        return clientService.getClients();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id){
        return clientService.getClientById(id);
    }

    @PostMapping("/create")
    public Client saveClient(@RequestBody CreateClientDTO createClientDTO){
        return clientService.saveClient(createClientDTO);
    }

    @PutMapping("/update/{id}")
    public Client updateClient(@RequestBody CreateClientDTO createClientDTO, @PathVariable Long id){
        return clientService.editClient(createClientDTO,id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteClient(@PathVariable Long id){
        clientService.deleteClient(id);
        return "Cliente con id: "+id+" eliminado exitosamente";
    }
}
