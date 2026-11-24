package repositorios;

import java.util.List;

import modelo.Articulo;
import objectMother.ArticulosOM;

public class ArticulosRepositorio {
	private List<Articulo> lista;

	public ArticulosRepositorio(ArticulosOM om) {
		super();
		lista=om.getAll();
	}

	public List<Articulo> getLista() {
		return lista;
	}
	
	
	
}
