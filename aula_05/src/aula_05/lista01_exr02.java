package aula_05;
import java.util.Scanner;

public class lista01_exr02 {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] organizados = new int[10];
		int countpar = 0;
		int countimpar = 0;
		
		for (int i = 0; i < 10; i ++) {
			System.out.println("Digite numeros");
			organizados[i] = Leia.nextInt();
		}
	
		for (int i = 0; i < 10; i ++ ) {
			int pares;;
			if (organizados[i] % 2 == 0 && organizados[i] > 0) {
				System.out.println("Sao: " + organizados[i] + " par");
				countpar ++;
			}
		}
		for (int i = 0; i < 10; i ++ ) {
			int impar;;
			if (organizados[i] % 2 == 0 && organizados[i] > 0) {
				System.out.println("Sao: " + organizados[i] + " impar");
				countimpar ++;
			}
		}
		System.out.println("Sao:  " + countimpar + " elementos impares");
		System.out.println("Sao:  " + countpar + " elementos pares");

		double soma = 0;
		double media = 0;
		for(double elemento : organizados) {
			soma = soma + elemento;
			}
		media = soma / organizados.length;
		System.out.println("Soma de todos é: " + soma + " . E a media é: " + media);

		}
		
	
}