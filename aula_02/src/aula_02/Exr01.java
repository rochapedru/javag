package aula_02;

import java.util.Scanner;

public class Exr01 {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
	int salario, abono, novoSal;
	salario = Leia.nextInt();
	abono = Leia.nextInt();
	novoSal = (abono + salario);
	System.out.print("Novo Salario "+ novoSal);
	}

}
