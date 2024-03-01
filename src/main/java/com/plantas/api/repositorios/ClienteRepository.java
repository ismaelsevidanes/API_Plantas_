package com.plantas.api.repositorios;

import java.util.Optional;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.plantas.api.entidades.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{
    //Page<Cliente> findAllByClientesContaining(String cliente, Pageable pageable);
    Optional<Cliente> findByDni(String dni);
    Boolean existsByDni(String dni);
 }
