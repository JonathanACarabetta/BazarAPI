package com.miapplication.BazarAPI.Service;
import com.miapplication.BazarAPI.DTO.CreateClientDTO;
import com.miapplication.BazarAPI.Model.Client;
import com.miapplication.BazarAPI.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements  IClientService{

    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client saveClient(CreateClientDTO createClientDTO) {
        Client client = new Client();
        client.setName(createClientDTO.getName());
        client.setLastName(createClientDTO.getLastName());
        client.setDni(createClientDTO.getDni());
        client.setDeleted(false);
        return clientRepository.save(client);
    }

    @Override
    public Client editClient(CreateClientDTO editClientDTO, Long id) {
        Client client = this.getClientById(id);
        client.setName(editClientDTO.getName());
        client.setLastName(editClientDTO.getLastName());
        client.setDni(editClientDTO.getDni());
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        Client client = this.getClientById(id);
        client.setDeleted(true);
        clientRepository.save(client);
    }
}
