package modelo;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	private final Map<Articulo, Integer> cesta;

	public Cart() {
		super();
		cesta = new HashMap<>();
	}

	public boolean agregar(Articulo articulo, int cantidad) {
		if (!cesta.containsKey(articulo))
			if (articulo.gestionarStock(cantidad)) {
				cesta.put(articulo, cantidad);
				return true;
			}
		return false;
	}
}
