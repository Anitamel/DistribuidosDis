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
	private Musica musica=null;
	
	
	//LIsta de musica
	
	private List<Musica> listMusica = new ArrayList<>();
	
	//Campo para el registro de una nueva Musica
	
	private int id;
	
	
	@PostConstruct
	public void init() {
		musica = new Musica();
	}
	public  Musica getMusica() {
		return musica;
	}
	public void setMusica(Musica musiSet) {
		this.musica=musiSet;
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
	
	/////////
	 public void setmusica(List<Musica> listMusica) {
		   this.listMusica=listMusica;
		 }
		 public void loadMusica() {
		  // listLugares=lugaDao.listLugares();
		 }
		 public  String loadEditarDatos(int id) {
		   return "";
		 }
		 public String eliminarMusica(MusicaD musica) {
		   try {
		     if (this.id!=0) {
		       
		     }else
		       musiDao.eliminar(id);
		       
		   }catch(Exception e) {
		     
		   }
		   return null;
		 }
		 //METOD PARA GUARDAR LUGAR 
		 public String guardar() {
		    System.out.println("GUARDAR <<<<>>>>> "+musica);
		   musiDao.guardar(musica);
		   return "";
		 }
		 public String editarMusica() {
		   musiDao.actualizar(musica);
		   return "";
		 }

}
