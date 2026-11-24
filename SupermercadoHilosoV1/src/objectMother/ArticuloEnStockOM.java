package objectMother;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import modelo.Articulo;

public class ArticuloEnStockOM implements ArticulosOM{

	private String[] barcodes = { "1", "2", "3", "4", "5", "6" };
	private String[] nombres = { "pan", "agua", "chocolate", "fresa", "sardina", "pollo" };
	private float[] precios = { 2, 3, 4, 2, 3, 4 };
	private ArrayList<Articulo> articulos;

	public ArticuloEnStockOM() {
		super();
		articulos = new ArrayList<>();
		for (int i = 0; i < barcodes.length; i++) {
			articulos.add(new Articulo(barcodes[i], nombres[i], precios[i]));
		}
	}

	public List<Articulo> getAll() {
		return articulos;
	}

	public Articulo getRandomOne() {
		return getAll().get(new Random().nextInt(articulos.size()));
	}

	public ArrayList<Articulo> cloneArticulos() throws CloneNotSupportedException {
		return (ArrayList<Articulo>) articulos.clone();
	}
}
