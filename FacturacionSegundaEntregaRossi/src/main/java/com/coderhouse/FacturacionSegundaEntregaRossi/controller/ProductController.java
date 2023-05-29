package com.coderhouse.FacturacionSegundaEntregaRossi.controller;

import com.coderhouse.FacturacionSegundaEntregaRossi.middleware.ResponseHandler;
import com.coderhouse.FacturacionSegundaEntregaRossi.model.Product;
import com.coderhouse.FacturacionSegundaEntregaRossi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/product")
public class ProductController {
    @Autowired
    private ProductService productoService;

    @PostMapping
    public ResponseEntity<Object> crearProducto (@RequestBody Product producto) {
        try {
            Product productSaved = productoService.crearProducto(producto);
            return ResponseHandler.generateResponse(
                    "Product saved successfully",
                    HttpStatus.OK,
                    productSaved
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
    public ResponseEntity<Object> obtenerProducto (@PathVariable int id){
        try {
            Product productFound = productoService.obtenerProducto(id);
            return ResponseHandler.generateResponse(
                    "Product get successfully",
                    HttpStatus.OK,
                    productFound
            );
        } catch (Exception e) {
            return ResponseHandler.generateResponse(
                    e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    null
            );
        }
    }

}
