package modelo;

import java.util.Map;

public class Cliente {
	private final String creditCard;
	private Cart carrito;
	private Map<Articulo, Integer> listaCompra;
	
	public Cliente(String creditCard) {
		super();
		this.creditCard = creditCard;
	}

	public void iniciarCompra() {
		this.carrito=new Cart();
	}
	
	public boolean agregarCarrito(Articulo articulo,int cantidad) {
		return carrito.agregar(articulo,cantidad);
	}

	private String getCreditCard() {
		return creditCard;
	}
	
	public boolean pagarCompra() {
		return false;
	}
}
