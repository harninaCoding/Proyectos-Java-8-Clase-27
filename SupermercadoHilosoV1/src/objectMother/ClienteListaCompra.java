package objectMother;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import modelo.Articulo;

public class ClienteListaCompra implements ListaCompraOM {

	@Override
	public Map<Articulo, Integer> getListaCompra(List<Articulo> folleto) {
		Random random = new Random();
		HashMap<Articulo, Integer> lista=new HashMap<Articulo, Integer>();
		int items=random.nextInt(folleto.size())+1;
		//hazlo con java 8
		for (int i = 0; i < items; ) {
			Articulo articulo = folleto.get(random.nextInt(folleto.size()));
			if(!lista.containsKey(articulo)) {
				int cantidad = random.nextInt(folleto.size())+1;
				lista.put(articulo, cantidad);
				i++;
			}
		}
		return lista;
	}

}
