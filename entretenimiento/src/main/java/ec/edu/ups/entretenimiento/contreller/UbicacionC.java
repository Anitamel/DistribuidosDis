package ec.edu.ups.entretenimiento.contreller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.entretenimiento.dao.UbicacionD;
import ec.edu.ups.entretenimiento.model.Ubicacion;

@ManagedBean
public class UbicacionC {

	@Inject
	private UbicacionD ubiDao;
	//insertar obje
	private Ubicacion ubicacion;
	
	
	// Para listar Ubicadioenes
	private List<Ubicacion> listUbicacion= new ArrayList<>();
	private int id;
	
	@PostConstruct
	public void init () {
		ubicacion =new Ubicacion();
		
		
	}
	public Ubicacion getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion=ubicacion;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public List<Ubicacion> getUbica(){
		return listUbicacion;
	}
	public void loadUbicacion() {
		//
	}
	public String loadEditatDatos(int id) {
		return "";
	}
	public String eliminarUbicacion(UbicacionD ubicacion) {
		 try {
		     if (this.id!=0) {
		       
		     }else
		       ubiDao.eliminar(id);
		       
		   }catch(Exception e) {
		     
		   }
		   return null;
		 }
		 //METOD PARA GUARDAR LUGAR 
		 public String guardar() {
		    System.out.println("GUARDAR <<<<>>>>> "+ubicacion);
		   ubiDao.guardar(ubicacion);
		   return "";
		 }
		 public String editarUbicacion() {
		   ubiDao.actualizar(ubicacion);
		   return "";
		 }
		
	}
	
	
	


