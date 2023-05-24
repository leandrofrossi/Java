package com.java.FacturacionPrimeraEntregaRossi.repository;

import com.java.FacturacionPrimeraEntregaRossi.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Integer> {
}
