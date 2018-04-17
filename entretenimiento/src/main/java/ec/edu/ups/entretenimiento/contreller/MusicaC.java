package ec.edu.ups.entretenimiento.contreller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import ec.edu.ups.entretenimiento.dao.MusicaD;
import ec.edu.ups.entretenimiento.model.Musica;


@ManagedBean
@SessionScoped
public class MusicaC implements Serializable{
	private static final long serialVersionUID=1L;
	
	@Inject
	private  MusicaD musiDao;
	private Musica musiModel=null;
	
	
	//LIsta de musica
	
	private List<Musica> listMusica = new ArrayList<>();
	
	//Campo para el registro de una nueva Musica
	
	private int id;
	
	
	@PostConstruct
	public void init() {
		musiModel = new Musica();
	}
	public  Musica getMusica() {
		return musiModel;
	}
	public void setMusica(Musica musiSet) {
		this.musiModel=musiSet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public List <Musica> getMusicas(){
		return listMusica;
		
	}
	

}
