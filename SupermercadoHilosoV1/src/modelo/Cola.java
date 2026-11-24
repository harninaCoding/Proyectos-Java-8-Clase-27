package modelo;

import java.util.ArrayDeque;

public class Cola {
	public ArrayDeque<Cliente> cola=new ArrayDeque<>();

	public Cola() {
		super();
//		for (int i = 0; i < 5000; i++) {
//			cola.add(i+1);
//		}
	}
	
	public void ingresarEnCola(Cliente cliente) {
		cola.push(cliente);
	}
	
}
