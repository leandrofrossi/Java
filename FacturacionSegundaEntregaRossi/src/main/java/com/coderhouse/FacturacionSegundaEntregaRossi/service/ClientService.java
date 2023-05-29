package com.coderhouse.FacturacionSegundaEntregaRossi.service;

import com.coderhouse.FacturacionSegundaEntregaRossi.model.Client;
import com.coderhouse.FacturacionSegundaEntregaRossi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clienteRepository;
    public Client crearCliente(Client cliente) throws Exception {
        return clienteRepository.save(cliente);
    }
    public Client obtenerCliente(int id) throws Exception {
        Optional<Client> cliente = clienteRepository.findById(id);
        if(cliente.isEmpty()){
            return null;
        } else {
            return cliente.get();
        }
    }


}
