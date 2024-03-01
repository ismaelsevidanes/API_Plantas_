package com.plantas.api.repositorios;

import java.util.Optional;



import org.springframework.data.jpa.repository.JpaRepository;

import com.plantas.api.entidades.Producto;

public interface ProductoRepository  extends JpaRepository<Producto, Integer>{
    Optional<Producto> findByNombre(String nombre);
    Boolean existsByNombre(String nombre);
    Optional<Producto> findById(Integer id);
    boolean existsById(Integer id);
 }