package objectMother;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import modelo.Articulo;

class ClienteListaCompraTest {

	@Test
	void testGetListaCompra() {
		ListaCompraOM listaCompraOM=new ClienteListaCompra();
		Map<Articulo, Integer> listaCompra = listaCompraOM.getListaCompra(new ArticuloEnStockOM().getAll());
		System.out.println();
		//los articulos no se repiten
		//la cantidad de cada articulo es correcta (positiva)
	}

}
