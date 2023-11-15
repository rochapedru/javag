import java.util.ArrayList;
import java.util.Scanner;

public class exr02_list {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int num, posicao;
		for(int i = 0; i <= 9; i ++) {
			System.out.println("Digite um numero: ");
			num = Leia.nextInt();
			numeros.add(num);
			
		}
		/**
		num = Leia.nextInt();
		posicao = numeros.indexOf(num);
		**/
		System.out.println(numeros);
		System.out.println("Digite um numero ");
		num = Leia.nextInt();
		int tentativas = 0;
		for (int i = 0; i <= 9; i++) {
			if (numeros.get(i) == num ) {
				System.out.println("O numero: " + num + " esta na posicao: " + i);
				tentativas ++;
			}
		}
		if (tentativas == 0){
			System.out.println("O numero " + num + " Nao foi encontrado");
		}
	
	}
}
