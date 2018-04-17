package ec.edu.ups.entretenimiento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lugar {
 
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="ubicacion")
	private String ubicacion;
	
	@Column(name="horario")
	private String horario;
	
	@Column(name="correo")
	private String correo;
	
}
