package aula_05;

import java.util.Scanner;
import java.util.Arrays;

public class vetores {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		String[] pessoas = {"Luiza", "Aline", "Vinicius", "Antonio", "Vitor,", "Samara"};
		String nomi;
		System.out.println("Digite o nome da pessoas que quer procurar a posicao na Array");
		nomi = Leia.nextLine();
		float[] notas = new float[pessoas.length];
		
		for(int indice = 0; indice < pessoas.length; indice ++) {
			System.out.println("Posicao " + (indice + 1) + " = " + pessoas[indice]);
		}
		
		System.out.println("\n");
		
		for(int indice = 0; indice < pessoas.length; indice ++) {
			System.out.println("Digite a nota de " + pessoas[indice] + ": ");
			notas[indice] = Leia.nextFloat();
		}
		for(int indice = 0; indice < pessoas.length; indice ++) {
			System.out.println("Nota de " + pessoas[indice] + " = " + notas[indice]);
		}
		
		// Classificar as pessoas e imprimir
		Arrays.sort(pessoas);
		for(int indice = 0; indice < pessoas.length; indice ++) {
			System.out.println("Pessoa " + (indice + 1) + " = " + pessoas[indice]);
			
		}
		System.out.println("\n");
		System.out.println("Posicao do elemento " + nomi + " na array: " + Arrays.binarySearch(pessoas, nomi));
		
		for (String pessoa : pessoas) {
			System.out.println(pessoa.toUpperCase());
		}
	}
}
