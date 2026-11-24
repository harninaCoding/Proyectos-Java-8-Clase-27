package control;

import modelo.Cajere;
import modelo.Cliente;
import modelo.Cola;
import objectMother.ArticuloEnStockOM;
import repositorios.ArticulosRepositorio;

public class Supermercado {
	private final ArticulosRepositorio articulosRepositorio;
	private Cajere cajere;
	private Cola cola;

	public Supermercado() {
		super();
		articulosRepositorio=new ArticulosRepositorio(new ArticuloEnStockOM());
		abrir();
	}

	private void abrir() {
		cola=new Cola();
		cajere=new Cajere("AAA", 120);
	}
	
	public void desarrollo() {
		Cliente cliente=new Cliente("AAA");
		cliente.iniciarCompra(articulosRepositorio.getLista());
		cliente.hacerCompra();
		cliente.hacerCola(cola);
		cajere.cobrarCliente(cola.sacar());
	}
	
	
}
