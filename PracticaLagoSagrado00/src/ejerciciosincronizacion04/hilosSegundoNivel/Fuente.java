package ejerciciosincronizacion04.hilosSegundoNivel;

public class Fuente implements Runnable {

	private int intervalo = 10;

	private static Fuente miFuente = new Fuente();

	private Fuente() {
	}

	public static Fuente getInstance() {
		return miFuente;
	}

	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}

	public void incrementarLago(Lago lagoSagrado) {
		lagoSagrado.incrementarVida();
	}

	@Override
	public void run() {
		rellenar();
	}

	private void rellenar() {
		int recargas = 0;
		while (true) {
			
			Lago instance = Lago.getInstance();
			synchronized (instance) {
				incrementarLago(instance);
//				try {
//					Thread.sleep(intervalo);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
			
//			System.out.println("Fuente:incrementando lago "+recargas++);
		}
	}

}
