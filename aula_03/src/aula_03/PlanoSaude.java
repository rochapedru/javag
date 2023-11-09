package aula_03;

import java.util.Scanner;

public class PlanoSaude {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		String nome;
		int idade;
		System.out.println("insira seu nome: ");
		nome = Leia.nextLine();
		System.out.println("insira Idade: ");
		idade = Leia.nextInt();
		if(idade > 0 && idade <= 10) {
			System.out.printf("%s plano custa $ 100/mes ", nome);
		}else if(idade >= 11 && idade <= 29) {
			System.out.printf("%s plano custa $ 200/mes ", nome);
		}else if(idade >= 30 && idade <= 45) {
			System.out.printf("%s plano custa $ 300/mes ", nome);
		}else if(idade >= 46 && idade <= 59) {
			System.out.printf("%s plano custa $ 500/mes ", nome);
		}else if(idade >= 60 && idade <= 65) {
			System.out.printf("%s plano custa $ 600/mes ", nome);
		}else {
			System.out.printf("%s plano custa $ 1000/mes ", nome);
		}
		
		
	}

}
