package ec.edu.ups.entretenimiento.dao;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.entretenimiento.model.Imagen;

@Stateless
public class ImagenD implements Serializable {
	
	private static final long serialVersionUID =1L;
	
	@Inject
	private EntityManager em;
	
	//Creacion de metodos basicos
	
	public void insertar(Imagen imaInsert) {
		em.persist(imaInsert);
		
	}
	public void actualizar (Imagen imaActu) {
		em.merge(imaActu);
		
	}
	public void eliminar(int codigo) {
		em.remove(leer(codigo));
	}
	public Imagen leer (int codigo) {
		Imagen imaInst =em.find(Imagen.class, codigo);
		return imaInst;
		
	}
	
	//Creaion del metodo Guardar
	public void guardar (Imagen imagGuard) {
		insertar(imagGuard);
	}

}
