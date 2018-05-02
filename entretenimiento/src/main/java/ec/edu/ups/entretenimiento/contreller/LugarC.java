package ec.edu.ups.entretenimiento.contreller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.entretenimiento.dao.LugarD;
import ec.edu.ups.entretenimiento.model.Lugar;


@ManagedBean
public class LugarC {

	
	@Inject
	private LugarD lugaDao;
	
	///Instaciar el  objetivo 
	
	private Lugar lugar;
	
	//Lista Usuarios
	private List<Lugar> listLugares= new ArrayList<>();
	
	private int id;
	
	@PostConstruct
	public void init () {
		lugar=new Lugar();
		
		
	}
	public Lugar getLugar() {
		return lugar;
		
	}
	public void setLugar(Lugar lugar) {
		this.lugar=lugar;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Lugar> getLuga(){
		return listLugares;
	}
 public void setLugarr(List<Lugar> listLugares) {
	 this.listLugares=listLugares;
 }
 public void loadLugar() {
	// listLugares=lugaDao.listLugares();
 }
 public  String loadEditarDatos(int id) {
	 return "";
 }
 public String eliminarLugar(LugarD lug) {
	 try {
		 if (this.id!=0) {
			 
		 }else
			 lugaDao.eliminar(id);
			 
	 }catch(Exception e) {
		 
	 }
	 return null;
 }
 //METOD PARA GUARDAR LUGAR 
 public String guardar() {
		System.out.println("GUARDAR <<<<>>>>> "+lugar);
	 lugaDao.guardar(lugar);
	 return "";
 }
 public String editarLugar() {
	 lugaDao.actualizar(lugar);
	 return "";
 }
}
