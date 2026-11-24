package objectMother;

import java.util.List;
import java.util.Map;

import modelo.Articulo;

public interface ListaCompraOM {

	public Map<Articulo, Integer> getListaCompra(List<Articulo> folleto) ;
}
