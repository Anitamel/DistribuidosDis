package ec.edu.ups.entretenimiento.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Video implements Serializable{
	
	private static final long serialVersionUID = 1L;
 @Id
 @Column(name="id")
 @GeneratedValue(strategy=GenerationType.SEQUENCE)
 private int id;
 
 @Column(name="nombre")
 private String nombre;
 
 @Column(name="descripcion")
 private String descripcion;

 
//Muchas a uno muchos videos esta en un servicio
 @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
 @JoinColumn(name="servicio")
 @JsonIgnore
 private  Servicio servicio;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

 

}

