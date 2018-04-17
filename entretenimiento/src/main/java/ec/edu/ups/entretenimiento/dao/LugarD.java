package ec.edu.ups.entretenimiento.dao;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.entretenimiento.model.Lugar;

@Stateless
public class LugarD implements Serializable {
	
	private static final long serialVersionUID=1L;
	
	@Inject
	private EntityManager em;
	
	//CREACION DE METODOS BASICOS
	
	public void insertat (Lugar lugaInt) {
		em.persist(lugaInt);
		
	}
	public void actualizar (Lugar lugaAct) {
		em.merge(lugaAct);
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
	public void guardar (Lugar lugGuard) {
		insertat(lugGuard);
		
	}

}
