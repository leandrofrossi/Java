package com.java43915.ClienteApiRestRossi.controller;

import com.java43915.ClienteApiRestRossi.middleware.ResponseHandler;
import com.java43915.ClienteApiRestRossi.model.Cliente;
import com.java43915.ClienteApiRestRossi.model.ClienteDTO;
import com.java43915.ClienteApiRestRossi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Object> crearCliente (@RequestBody Cliente cliente) {
        try {
            Cliente clientSaved = clienteService.crearCliente(cliente);
            return ResponseHandler.generateResponse(
                    "Client saved successfully",
                    HttpStatus.OK,
                    clientSaved
            );
        } catch (Exception e){
            return ResponseHandler.generateResponse(
                    e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    null
            );
        }
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Object> obtenerCliente (@PathVariable int id){
        try {
            ClienteDTO clientFound = clienteService.obtenerCliente(id);
            return ResponseHandler.generateResponse(
                    "Client get successfully",
                    HttpStatus.OK,
                    clientFound
            );
        } catch (Exception e){
            return ResponseHandler.generateResponse(
                    e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    null
            );
        }
    }

}
