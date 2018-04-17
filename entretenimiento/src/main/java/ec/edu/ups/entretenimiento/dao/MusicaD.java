package ec.edu.ups.entretenimiento.dao;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.entretenimiento.model.Musica;

@Stateless
public class MusicaD  implements Serializable {
	private static final long serialVersionUID =1L;
		
			@Inject
			private EntityManager em; 
	
	//Creacion de los metodos basicos
	
public void insertar (Musica musiInsert) {
	em.persist(musiInsert);
}
public void actualizar (Musica musiAct) {
	em.merge(musiAct);
}
public void eliminar (int codigoE) {
	em.remove(leer(codigoE));
}

//Creacion del Metod para ler
public  Musica leer(int codigoL) {
	Musica musiInst= em.find(Musica.class, codigoL);
	return musiInst;
}
//Metodo guardar 
public void guardar (Musica musiGuar) {
	insertar(musiGuar);
}
}
