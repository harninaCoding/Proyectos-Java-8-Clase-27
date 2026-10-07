package ejercicio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Ejercicio01 {
//	1. Genere 10 números aleatorios que van del 1 al 100
//	y colóquelos en una coleccion. 
	public List<Integer> getRandomValuesImperativa(int min,int max,int amount){
		ArrayList<Integer> lista=new ArrayList<Integer>();
		Random aleatorio=new Random();
		for (int i = 0; i < amount; i++) {
			lista.add(aleatorio.nextInt(min, max));
		}
		return lista;
	}
	public List<Integer> getRandomValuesDeclarativa(int min,int max,int amount){
		return new Random()
				//genera un flujo de ints
				.ints(min, max)
				//limit dedice cuantos valores cogeremos del flujo intStream
				.limit(amount)
				//boxed convierte el intStream en un Stream "normal"
				.boxed()
				//Coleccionar el flujo
				.collect(Collectors.toList());
	}
	
	
}
