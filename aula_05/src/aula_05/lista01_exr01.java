package aula_05;
import java.util.Scanner;

public class lista01_exr01 {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] organizados = new int[10];
		int ver;
		for (int i = 0; i < 10; i ++) {
			System.out.println("Digite numeros");
			organizados[i] = Leia.nextInt();
		}
		System.out.println("qual quer encontrar: ");
		ver = Leia.nextInt();
		for (int i = 0; i < 10; i ++ ) {
			if (organizados[i] == ver) {
				System.out.println("na posicao: " + i);
			}else {
				System.out.println("Nao encontrado");
			}
		}
		

		
			
		
	}


}
