package com.java43915.ClienteApiRestRossi.repository;

import com.java43915.ClienteApiRestRossi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
