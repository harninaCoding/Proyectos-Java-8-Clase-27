package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArticuloTest {

	@Test
	void testComprobarStock() {
		int stock = 20;
		Articulo articulo=new Articulo("3", "caviar", 1f);
		articulo.setStock(stock);
		int cantidad=articulo.getStock()-1;
		int resultado=articulo.gestionarStock(cantidad);
		assertTrue(articulo.getStock()>0);
		assertEquals(cantidad, resultado);
		// segunda prueba negativa
		articulo.setStock(stock);
		cantidad=articulo.getStock()+1;
		resultado=articulo.gestionarStock(cantidad);
		assertTrue(articulo.getStock()==0);
		assertEquals(stock, resultado);
	}

}
