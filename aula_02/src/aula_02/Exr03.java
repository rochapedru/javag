package aula_02;

import java.util.Scanner;

public class Exr03 {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		int bruto, noturno, extra, desconto, liquido;
		
		bruto = Leia.nextInt();
		noturno = Leia.nextInt();
		extra = Leia.nextInt();
		desconto = Leia.nextInt();
		
		liquido = bruto + noturno + (extra * 5) - desconto;
		System.out.println("Salario Liquido " + liquido);
		// TODO Auto-generated method stub

	}

}
