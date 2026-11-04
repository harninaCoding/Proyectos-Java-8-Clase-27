package ejercicio04;

public class MundoSinHilos {
public static void main(String[] args) {
	Fuente fuente=Fuente.getInstance();
	fuente.run();
	Lago instance = Lago.getInstance();
	int vida = instance.getVida();
	System.out.println(" en el lago hay "+vida);
}
}
