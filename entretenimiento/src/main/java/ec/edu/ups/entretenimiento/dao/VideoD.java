package ec.edu.ups.entretenimiento.dao;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.entretenimiento.model.Video;

@Stateless
public class VideoD implements Serializable {
	
	private static final long serialVersionUID=1L;
	
	@Inject
	private EntityManager em;
	
	//Creacion de metodos  basicos
	
	public void insertar(Video vidInsert) {
		em.persist(vidInsert);
	}
	public void actualizar (Video vidActu) {
		em.merge(vidActu);
	}
	
	//Creacion del metodo elliminar
	
	public void eliminar (int codigoE) {
		em.remove(leer(codigoE));
	}
	//Creacion del metodo  para poder lerr
	
	public Video leer (int codigoL) {
		Video vidInst=em.find(Video.class, codigoL);
		return vidInst;
	}
	
	//Creacion del metodo Guardar 
	public void guardar(Video vidGuar) {
		insertar(vidGuar);
	}

}
