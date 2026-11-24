package modelo;

import java.util.List;
import java.util.Map;

import objectMother.ClienteListaCompra;

public class Cliente {
	private final String creditCard;
	private Cart carrito;
	private Map<Articulo, Integer> listaCompra;
	
	public Cliente(String creditCard) {
		super();
		this.creditCard = creditCard;
	}

	public void iniciarCompra(List<Articulo> folleto) {
		this.carrito=new Cart();
		listaCompra=new ClienteListaCompra().getListaCompra(folleto);
	}
	
	public void hacerCompra() {
		listaCompra.entrySet().stream().forEach(entry->{
			agregarCarrito(entry.getKey(), entry.getValue());
		});
	}
	
	public void hacerCola(Cola cola) {
		cola.ingresarEnCola(this);
	}
	
	public Cart getCarrito() {
		return carrito;
	}

	public void agregarCarrito(Articulo articulo,int cantidad) {
		carrito.agregar(articulo,cantidad);
	}

	private String getCreditCard() {
		return creditCard;
	}
	
	public boolean pagarCompra(float totalizarCuenta) {
		return true;
	}
}
