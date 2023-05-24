package com.java.FacturacionPrimeraEntregaRossi.repository;

import com.java.FacturacionPrimeraEntregaRossi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
