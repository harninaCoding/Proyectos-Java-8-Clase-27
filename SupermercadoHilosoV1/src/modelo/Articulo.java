package modelo;

import java.util.Objects;

public class Articulo {
	private String barCode;
	private String nombre;

	private float precio;
	private int stock = 0;

	public Articulo(String barCode, String nombre, float precio) {
		super();
		this.barCode = barCode;
		this.nombre = nombre;
		setPrecio(precio);
	}

	public float getPrecio() {
		return precio;
	}

	private void setPrecio(float precio) {
		assert precio > 0;
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		assert stock > 0;
		this.stock = stock;
	}

	private String getBarCode() {
		return barCode;
	}

	private String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(barCode, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		return Objects.equals(barCode, other.barCode) && Objects.equals(nombre, other.nombre);
	}

	public int gestionarStock(int cantidadSolicitada) {
		return comprobarStock(cantidadSolicitada);
	}

	private void decrementaStock(int cantidad) {
		// TODO Auto-generated method stub
	}

	public int comprobarStock(int cantidad) {
		stock=stock-cantidad;
		if(stock<0) {
			cantidad+=stock;
			stock=0;
		}
		return cantidad;
	}

}
