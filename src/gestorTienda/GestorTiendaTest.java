package gestorTienda;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GestorTiendaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@Test
	void testCalcularDescuento() {
		GestorTienda gestorTienda = new GestorTienda();
		Double resultado = gestorTienda.calcularDescuento(1, 1000);
		assertEquals(0.1, resultado);
		resultado = gestorTienda.calcularDescuento(1, 7);
		assertEquals(0.05, resultado);
		resultado = gestorTienda.calcularDescuento(1, 1);
		assertEquals(0, resultado);
	}

	@Test
	void testCategorizarProducto() {
		GestorTienda gestorTienda = new GestorTienda();
		String resultado = gestorTienda.categorizarProducto(6);
		assertEquals("Económico", resultado);
		resultado = gestorTienda.categorizarProducto(36);
		assertEquals("Estándar", resultado);
		resultado = gestorTienda.categorizarProducto(60);
		assertEquals("Premium", resultado);
	}

	@Test
	void testBuscarProducto() {
		GestorTienda gestorTienda = new GestorTienda();
		String resultado = gestorTienda.buscarProducto();
	}

}