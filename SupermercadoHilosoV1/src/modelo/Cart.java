package modelo;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	private final Map<Articulo, Integer> cesta;

	public Cart() {
		super();
		cesta = new HashMap<>();
	}

	public void agregar(Articulo articulo, int cantidad) {
			int cantidadReal = articulo.gestionarStock(cantidad);
			if (cantidadReal>0) {
				cesta.put(articulo, cantidadReal);
			}
	}
	
	public float totalizarCuenta() {
		return (float) cesta.entrySet().stream().mapToDouble(entry->{
			return entry.getKey().getPrecio()*entry.getValue();
		}).sum();
	}
}
