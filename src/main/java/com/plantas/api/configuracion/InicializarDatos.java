package com.plantas.api.configuracion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dwes.api.entidades.Jabon;
import com.github.javafaker.Faker;
import com.plantas.api.entidades.Cliente;
import com.plantas.api.entidades.Empleado;
import com.plantas.api.entidades.Producto;
import com.plantas.api.entidades.Venta;
import com.plantas.api.repositorios.ClienteRepository;
//import com.plantas.api.repositorios.EmpleadoRepository;
import com.plantas.api.repositorios.ProductoRepository;
//import com.plantas.api.repositorios.VentaRepository;

@Component
public class InicializarDatos implements CommandLineRunner {

	  @Autowired
	    private ClienteRepository clienteRepository;
	  
	  @Autowired
	    private ProductoRepository productoRepository;
	
	  
	  @Override
	    public void run(String... args) throws Exception {
	    	
	    	try {
	    	// Cliente 1
	            Cliente cliente1 = new Cliente();
	            cliente1.setDni("12345678A");
	            cliente1.setNombre("Ismael");
	            cliente1.setApellidos("sevidanes del Moral");
	            cliente1.setTelefono(123456789);
	            cliente1.setDireccion("Calle asa  nº 1");
	            cliente1.setEmail("ismael.sevidanes@example.com");
	            cliente1.setPassword("password123");
	            clienteRepository.save(cliente1);
	            
	         // Cliente 2
	            Cliente cliente2 = new Cliente();
	            cliente2.setDni("87654321Z");
	            cliente2.setNombre("Manuel");
	            cliente2.setApellidos("Rodriguez");
	            cliente2.setTelefono(987654321);
	            cliente2.setDireccion("Calle bas  nº 2");
	            cliente2.setEmail("manuel.rodriguez@example.com");
	            cliente2.setPassword("password123");
	            clienteRepository.save(cliente2);
	            
	    	// Producto 1
	            Producto producto1 = new Producto();
	            producto1.setNombre("Amapola");
	            producto1.setDescripcion("Amapola de plastico para regalar a esa persona especial");
	            producto1.setStock(320);
	            producto1.setPrecio(10);
	            productoRepository.save(producto1);
	            
	         // Producto 2
	            Producto producto2 = new Producto();
	            producto2.setNombre("Planta decorativa ");
	            producto2.setDescripcion("Planta decorativa para embellecer el mejor lugar de tu hogar");
	            producto2.setStock(1000);
	            producto2.setPrecio(22);
	            productoRepository.save(producto2);
	            
	    	}catch(Exception e) {
	    		
	    	}

	        
	    }
}