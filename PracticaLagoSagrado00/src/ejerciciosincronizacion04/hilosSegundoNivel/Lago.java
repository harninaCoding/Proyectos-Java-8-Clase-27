package ejerciciosincronizacion04.hilosSegundoNivel;

public class Lago {

	private static Lago instancia = new Lago();
	private int vida = 0;

	private Lago() {
	}

	public int getVida() {
		return vida;
	}

	public static Lago getInstance() {
		return instancia;
	}

	public void incrementarVida() {
		vida++;
	}

	public int beber() {
		if (vida > 0) {
			vida--;
			return 1;
		} else
			return 0;
	}

	public boolean isVacio() {
		return vida == 0;
	}
}
