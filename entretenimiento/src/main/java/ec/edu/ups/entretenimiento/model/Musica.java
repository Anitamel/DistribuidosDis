package ec.edu.ups.entretenimiento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Musica {
 @Id
 @Column(name="id")
 private int id;
 
 @Column(name="nombre")
 private String nombre;
 
 @Column(name="descripcion")
 private String descripcion;
 
}
