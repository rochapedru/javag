package aula_02;

import java.util.Scanner;

public class Exr02 {
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		int n1, n2, n3, n4, media;
		
		n1 = Leia.nextInt();
		n2 = Leia.nextInt();
		n3 = Leia.nextInt();
		n4 = Leia.nextInt();
		
		media = (n1 + n2 + n3 + n4)/4;
		
		System.out.println("Sua media é: " + media);	
		
		// TODO Auto-generated method stub
	}

}
