package aula_04;
import java.util.Scanner;

public class lista03_exr05 {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) { 
		int num, soma = 0;
	
		do {
			num = Leia.nextInt();
			soma = soma + num;

		} while (num != 0);
		if (soma > 0) {
			System.out.println(soma);
		}
	}
	
}