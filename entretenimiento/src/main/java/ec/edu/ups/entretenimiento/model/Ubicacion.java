package ec.edu.ups.entretenimiento.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ubicacion implements Serializable {
	private static  final long serialVersionUID= 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="calle_primaria")
	private String calle_primaria;
	
	@Column(name="calle_secundaria")
	private String calle_secundaria;
	
	@Column(name="numero_local")
	private String numero_local;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCalle_primaria() {
		return calle_primaria;
	}

	public void setCalle_primaria(String calle_primaria) {
		this.calle_primaria = calle_primaria;
	}

	public String getCalle_secundaria() {
		return calle_secundaria;
	}

	public void setCalle_secundaria(String calle_secundaria) {
		this.calle_secundaria = calle_secundaria;
	}

	public String getNumero_local() {
		return numero_local;
	}

	public void setNumero_local(String numero_local) {
		this.numero_local = numero_local;
	}
	

}
