package ec.edu.ups.entretenimiento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Video {
 @Id
 @Column(name="id")
 private int id;
 
 @Column(name="nombre")
 private String nombre;
 @Column(name="descripcion")
 private String descripcion;
 @Column(name="url")
 private String url;
 
 
}
