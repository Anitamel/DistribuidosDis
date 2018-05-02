package ec.edu.ups.entretenimiento.dao;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.entretenimiento.model.Categoria;

@Stateless
public class CategoriaD  implements Serializable{
	private static final long serialVersionUID=1L;
	
	@Inject
	private EntityManager em;
	
	//Creacion DE METODOS BASICOS
	
	public void insertar(Categoria categoria) {
		em.persist(categoria);
	}
	public void actualizar (Categoria categoria) {
		em.merge(categoria);
	}
	//Metodo Eliminar 
	public void eliminar (int codigoE) {
		em.remove(leer(codigoE));
	}
///MEtod
	public Categoria leer (int codigoL) {
		Categoria catInst=em.find(Categoria.class, codigoL);
		return catInst;
	}
	
	//Creacion del metodo Guardar
	
	public void guardar (Categoria catGuar) {
		insertar(catGuar);
	}
}
