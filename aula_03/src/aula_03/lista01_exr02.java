package aula_03;

import java.util.Scanner;

public class lista01_exr02 {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		num = Leia.nextInt();
		if (num == 0) {
			System.out.println(num + " é zero");
		}else if (num > 0) {
			System.out.println(num + " é positivo");
		}else if (num < 0) {
			System.out.println(num + " é negativo");
		}
		

	}
}
