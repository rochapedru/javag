package aula_03;

import java.util.Scanner;

public class lista02_exr03 {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome, resposta;
		int idade;
		boolean doou = false;
		System.out.println("Nome..: ");
		nome = Leia.nextLine();
		System.out.println("Idade..");
		idade = Leia.nextInt();
		Leia.nextLine();
		System.out.println("sera primeira.. sim ou nao: ");
		resposta = Leia.nextLine();
		if (resposta.equalsIgnoreCase("sim")) {
			doou = true;
		} else if ((resposta.equalsIgnoreCase("nao"))){
			doou = false;
		}
		if ( doou == false && idade > 17 && idade < 70) {
			System.out.println(nome + " está apto(a), para doar sangue");
		}
		else if (idade > 17 && idade < 60) {
			System.out.println(nome + " está apto(a), para doar sangue");
		}
		else {
			System.out.println(nome + " nao pode");
		}
		
		
		

	}

}
