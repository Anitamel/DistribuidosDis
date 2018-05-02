package ec.edu.ups.entretenimiento.dao;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.entretenimiento.model.Lugar;

@Stateless
public class LugarD  {
	

	
	@Inject
	private EntityManager em;
	
	//CREACION DE METODOS BASICOS
	
	public void insertat (Lugar lugar) {
		em.persist(lugar);
		
	}
	public void actualizar (Lugar lugar) {
		em.merge(lugar);
	}
	
	public void eliminar (int codigo) {
		em.remove(leer(codigo));
	}
	
////Metetodo 
	public Lugar leer(int codigo) {
		Lugar lugInstan= em.find(Lugar.class, codigo);
		return lugInstan;
		
	}
	
	//Metod guardad 
	public void guardar (Lugar lugar) {
		em.persist(lugar);
		
	}

}
