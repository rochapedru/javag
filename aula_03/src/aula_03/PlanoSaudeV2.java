package aula_03;

import java.util.Scanner;

public class PlanoSaudeV2 {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int faixaIdade;
		System.out.println("insira seu nome: ");
		nome = Leia.nextLine();
		System.out.println("1) 0 - 10 anos");
		System.out.println("2) 10 - 29 anos");
		System.out.println("3) 30 - 45 anos"); 
		System.out.println("4) 46 - 59 anos");
		System.out.println("5) 60 - 65 anos");
		System.out.println("6) Mais de 60");
		System.out.println("insira faixa: ");
		faixaIdade = Leia.nextInt();
		
		switch(faixaIdade) {
		case 1:
			System.out.printf("%s plano custa $ 100/mes ", nome);
			break;
		case 2:
			System.out.printf("%s plano custa $ 200/mes ", nome);
			break;
		case 3:
			System.out.printf("%s plano custa $ 300/mes ", nome);
			break;
		case 4:
			System.out.printf("%s plano custa $ 500/mes ", nome);
			break;
		case 5:
			System.out.printf("%s plano custa $ 600/mes ", nome);
			break;
		case 6:
			System.out.printf("%s plano custa $ 1000/mes ", nome);
			break;

		}
	}

}
