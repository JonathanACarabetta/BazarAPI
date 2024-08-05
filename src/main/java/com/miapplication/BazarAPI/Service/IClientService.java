package com.miapplication.BazarAPI.Service;

import com.miapplication.BazarAPI.DTO.CreateClientDTO;
import com.miapplication.BazarAPI.Model.Client;

import java.util.List;

public interface IClientService {
    /** Get all Clients*/
    public List<Client> getClients();
    /** Get one CLient By id*/
    public Client getClientById(Long id);
    /** Create a Client using info in CreateClientDTO*/
    public void saveClient(CreateClientDTO createClientDTO);
    /** Edit a Client using info in editCLientDTO and existing id*/
    public Client editClient(CreateClientDTO editClientDTO, Long id);
    /** SoftDelete a Client using an existing id*/
    public void deleteClient(Long id);
}
