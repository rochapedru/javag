import java.util.ArrayList;
import java.util.Scanner;

public class lista {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Double> notas = new ArrayList<Double>();
		/** 
		System.out.println("Digite uma nota");
		Double numero;	
		notas.add(numero);  **/ /**
		numero = Leia.nextDouble();  **/
		notas.add(7.0);
		notas.add(4.0);
		notas.add(6.0);
		notas.add(7.0);
		notas.add(9.0);
		for (var nota : notas) {
			System.out.println(nota);
		}
		System.out.println(notas);
		System.out.println("Posicao do elemento e 1 ocorrencia do 7: " + notas.indexOf(7.0));
		System.out.println("existe o elemento 7: " + notas.contains(7.0));
		System.out.println("elemento na posicao 0, é:  " + notas.get(0));
		
		notas.remove(3);
		
		System.out.println(notas);
		
		//* faz a mesca coisa que for (var notas: noras) { }
		notas.forEach(System.out::println);
		
		notas.clear();
		System.out.println("A lista esta vazia: " + notas.isEmpty());
		

	}

}
