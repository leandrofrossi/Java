package com.java43915.ClienteApiRestRossi.service;

import com.java43915.ClienteApiRestRossi.model.Cliente;
import com.java43915.ClienteApiRestRossi.model.ClienteDTO;
import com.java43915.ClienteApiRestRossi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    public Cliente crearCliente(Cliente cliente) throws Exception{
        return clienteRepository.save(cliente);
    }
    public ClienteDTO obtenerCliente(int id) throws Exception{
        Optional<Cliente> cliente= clienteRepository.findById(id);
        if(cliente.isEmpty()){
            return null;
        } else {
            return new ClienteDTO(
                    cliente.get().getNombre(),
                    cliente.get().getApellido(),
                    calculoEdad(cliente.get().getFechaNacimiento())
            );
        }
            }
    private int calculoEdad(LocalDate fechaNacimiento){
        LocalDate fechaHoy = LocalDate.now();
        return Period.between(fechaNacimiento, fechaHoy).getYears();
    }
}
