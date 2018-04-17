package ec.edu.ups.entretenimiento.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Categoria  implements Serializable{
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="descripcion")
	private String descripcion;
	
	//Creacion de las  relaciones de UNo a muchos

	@OneToMany(cascade=Cascade)
	
	
	

}
