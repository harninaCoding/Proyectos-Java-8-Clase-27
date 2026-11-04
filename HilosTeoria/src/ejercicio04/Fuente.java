package ejercicio04;

public class Fuente extends Thread {

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
		int contador=0;
		boolean bandera=true;
		while (bandera) {
			try {
				sleep(intervalo);
				System.out.println("cr3ando vida");
				if(contador++>10) bandera=false;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			incrementarLago(Lago.getInstance());
		}
	}

}
