package ec.edu.ups.entretenimiento.contreller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.entretenimiento.dao.VideoD;
import ec.edu.ups.entretenimiento.model.Video;

@ManagedBean
public class VideoC {
	@Inject
	private VideoD videoDao;
	
	private Video video;

	private List<Video> listVideo=new ArrayList<Video>();
	
	private int id;
	
	@PostConstruct
	public void init () {
		video=new Video();
	}
	/////////
	public Video getVide() {
	    return video;
	    
	  }
	  public void setVideo(Video video) {
	    this.video=video;
	  }
	  public int getId() {
	    return id;
	  }
	  public void setId(int id) {
	    this.id = id;
	  }
	  public List<Video> getVideo(){
	    return listVideo;
	  }
	 public void setVideo(List<Video> lVideos) {
	   this.listVideo=listVideo;
	 }
	 public void loadVideo() {
	  // listLugares=lugaDao.listLugares();
	 }
	 public  String loadEditarDatos(int id) {
	   return "";
	 }
	 public String eliminarVideo(VideoD video) {
	   try {
	     if (this.id!=0) {
	       
	     }else
	       videoDao.eliminar(id);
	       
	   }catch(Exception e) {
	     
	   }
	   return null;
	 }
	 //METOD PARA GUARDAR LUGAR 
	 public String guardar() {
	    System.out.println("GUARDAR <<<<>>>>> "+video);
	   videoDao.guardar(video);
	   return "";
	 }
	 public String editarVideo() {
	   videoDao.actualizar(video);
	   return "";
	 }
}
