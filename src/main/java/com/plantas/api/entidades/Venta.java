package com.plantas.api.entidades;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Ventas")
public class Venta {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	  
	  // FK de la tabla cliente del id
	  @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "cliente_id")
	    @NotNull(message = "El cliente es obligatorio") // Asegura que el cliente tenga una venta asociada
	    private Cliente cliente;
	  

	  // FK de la tabla empleado del id
	  @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "empleado_id")
	    @NotNull(message = "El empleado es obligatorio") // Asegura que el empleado tenga una venta asociada
	    private Empleado empleado;
	  
	  private Date fecha;
	  
	    
//	    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "ventas")
//	    private Set<Producto> productos = new HashSet<>();
	  
	  // FK de la tabla productos de los id(aqui deberian salir uno o mas id segun si la venta tiene varios productos, averiguiar como hacer esto)
	  @Id
	  private Integer id_productos;
	  
	  
		public Date getFecha() {
			return fecha;
		}
	    
	    public void setFecha(Date fecha) {
	        this.fecha = fecha;
	    }
	    
		public Integer getId_productos() {
			return id_productos;
		}
	    
	    public void setId_productos(Integer id_productos) {
	        this.id_productos = id_productos;
	    }
	    
//		public Set<Producto> getProductos() {
//			return productos;
//		}
//
//		public void setProductos(Set<Producto> productos) {
//			this.productos = productos;
//		}
//		
//		public boolean agregarProducto(Producto producto) {
//			return this.productos.add(producto);
//		}
}