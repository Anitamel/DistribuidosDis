package ec.edu.ups.entretenimiento.contreller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.entretenimiento.dao.CategoriaD;
import ec.edu.ups.entretenimiento.model.Categoria;

@ManagedBean
public class CategoriaC implements Serializable {
	private static final long serialVersionUID=1L;
	
	@Inject
	private CategoriaD categoriaDao;
	
	private Categoria categoria = null;
	
	//Lista de Categrias
	private List<Categoria> categorias = new ArrayList<Categoria>();
	
	private  int id;
	
	
	//EL postCOnstrucion hace
	//El metodo Init es para 
	@PostConstruct
	public void init () {
		categoria = new Categoria();
		
	}
	//Metodo para 
	public Categoria getCategoria() {
		return categoria;
	}
	//Metodo para  r
	public  void setCategoria(Categoria catego) {
		this.categoria=catego;
	}
 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//LISta de 
	public List<Categoria> getCategorias(){
		return categorias;
	}
	
	public void setCategorias(List<Categoria> categorias) {
		this.categorias=categorias;
	}
	public void loadCategorias() {
		//categorias=categoriaDao.lis
	}

	// Metodo para  guardar la categora
	public String loadEditarDatos(int id) {
		return "";
	}
	public String eliminarCategoria(CategoriaD cate) {
		try {
			if(this.id!=0) {
				//S
			}else
				categoriaDao.eliminar(id);
		}catch(Exception e) {
			
		}
		return null;
		
	}
	//Metod para Guadar la categoria
	public String guardar() {
		System.out.print("");
		categoriaDao.guardar(categoria);
		return "";
	}
	//Metodo para realizar
	public String editarGategoria() {
		categoriaDao.actualizar(categoria);
	return "";
	}
	
}



