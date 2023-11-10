package aula_04;

import java.util.Scanner;

public class Pesquisa {
	
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		int idade, esporte, futebol = 0, voleiM18 = 0, basqueteMen18 = 0, outros = 0;
		String continua = "S";
		
		while (continua.equalsIgnoreCase("S")) {
			System.out.println("Digite idade: ");
			idade = Leia.nextInt();
			
			System.out.println("1-fut , 2-vol, 3-basq, 4- outros");
			esporte = Leia.nextInt();
			// quantas gosta fut
			if(esporte == 1) {
				futebol ++;
			}
			if(esporte == 2 && idade > 18) {
				voleiM18 ++;
			}
			if(esporte == 3 && idade < 18) {
				basqueteMen18 ++;
			}
			if (esporte == 4) {
				outros ++;
			}
			
			System.out.println("Continuar (S|N");
			Leia.skip("\\R");
			continua = Leia.nextLine().toUpperCase();
					
			
		}
		
		System.out.println("num fut: " + futebol);
		System.out.println("num vol > 18: " + voleiM18);
		System.out.println("num basq < 18: " + basqueteMen18);
		System.out.println("num fut: " + outros);
		
		

	}

}