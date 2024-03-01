package com.plantas.api.entidades;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.Getter;
//import lombok.Setter;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;



@Entity
@Table(name = "clientes")
public class Cliente {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	  
//	  @Setter
//	  @Getter
	  @Column(unique = true)
	    private String dni;
	  
	  @NotBlank(message = "El nombre no puede estar vacío") // Asegura que el nombre no sea null o esté vacío
	   @Size(min=1, max = 25, message = "Un mínimo de 1 y máximo de 25 caracteres") // Limita la longitud del nombre
	    private String nombre;
	  
	  @NotBlank(message = "Los apellidos no puede estar vacío") // Asegura que no sea null o esté vacío
	   @Size(min=1, max = 35, message = "Un mínimo de 1 y máximo de 25 caracteres") // Limita la longitud 
	    private String apellidos;
	    
	    @NotBlank(message = "El telefono no puede estar vacío") // Asegura que no sea null o esté vacío
	    private Integer telefono;
	    
	    @NotBlank(message = "La direccion no puede estar vacío") // Asegura que no sea null o esté vacío
	    private String direccion;
	    
	    @NotBlank(message = "El email no puede estar vacío") // Asegura que no sea null o esté vacío
	    private String email;
	    
	  @NotBlank(message = "La contraseña no puede estar vacío") // Asegura que no sea null o esté vacío
	    private String password; 
	  
	  	
		public String getDni() {
			return dni;
		}
	    
	    public void setDni(String dni) {
	        this.dni= dni;
	    }
	  
		public String getNombre() {
			return nombre;
		}
	    
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    
	    public String getApellidos() {
			return apellidos;
		}
	    
	    public void setApellidos(String apellidos) {
	        this.apellidos = apellidos;
	    }
	    
		public Integer getTelefono() {
			return telefono;
		}
	    
	    public void setTelefono(Integer telefono) {
	        this.telefono = telefono;
	    }
	    
	    public String getDireccion() {
			return direccion;
		}
	    
	    public void setDireccion(String direccion) {
	        this.direccion = direccion;
	    }
	    
		public String getEmail() {
			return email;
		}
	    
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
		public String getPassword() {
			return password;
		}
	    
	    public void setPassword(String password) {
	        this.password = password;
	    }
}