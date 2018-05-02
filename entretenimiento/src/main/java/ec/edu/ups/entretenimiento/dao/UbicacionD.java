package ec.edu.ups.entretenimiento.dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.entretenimiento.model.Ubicacion;

@Stateless
public class UbicacionD {
	
	@Inject
	private EntityManager em;
	
//	CREACION DE LOS METOS BASIOS
	public void insertar(Ubicacion ubicacion) {
		em.persist(ubicacion);
	}
	public void actualizar (Ubicacion ubicacion) {
		em.merge(ubicacion);
		
	}
	//Para eliminar 
	public void eliminar (int codigo) {
		em.remove(leer(codigo));
	}
	//Metodo para leer
	public Ubicacion leer (int codigo) {
	Ubicacion lugL= em.find(Ubicacion.class,codigo);
	return lugL;
	}
	//Metodo para guardarr
	public void guardar(Ubicacion ubicacion) {
		em.persist(ubicacion);
		
	}

}
