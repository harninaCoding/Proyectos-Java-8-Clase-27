package ejerciciosincronizacion04.hilosSegundoNivel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mundo {
	public static void main(String[] args) {
		Fuente fuente = Fuente.getInstance();
		ExecutorService threadPool = Executors.newCachedThreadPool();
		threadPool.execute(fuente);
		threadPool.execute(new Ser("Felix", 4));
		threadPool.execute(new Ser("Manolito", 5));
		threadPool.shutdown();
	}
}
