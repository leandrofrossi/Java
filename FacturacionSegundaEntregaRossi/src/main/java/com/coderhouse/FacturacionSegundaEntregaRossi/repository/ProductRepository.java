package com.coderhouse.FacturacionSegundaEntregaRossi.repository;

import com.coderhouse.FacturacionSegundaEntregaRossi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
