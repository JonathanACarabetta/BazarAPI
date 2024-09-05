package com.miapplication.BazarAPI.Service;
import com.miapplication.BazarAPI.DTO.CreateClientDTO;
import com.miapplication.BazarAPI.Model.Client;
import java.util.List;

public class ClientService implements  IClientService{
    @Override
    public List<Client> getClients() {
        return List.of();
    }

    @Override
    public Client getClientById(Long id) {
        return null;
    }

    @Override
    public void saveClient(CreateClientDTO createClientDTO) {

    }

    @Override
    public Client editClient(CreateClientDTO editClientDTO, Long id) {
        return null;
    }

    @Override
    public void deleteClient(Long id) {

    }
}
