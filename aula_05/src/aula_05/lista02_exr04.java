package aula_05;
import java.util.Scanner;

public class lista02_exr04 {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		double[][] matriz = new double[10][4];
		double media;

		for(int indiceI = 0; indiceI < matriz.length; indiceI ++) {
			for(int indiceJ = 0; indiceJ < matriz[indiceI].length; indiceJ ++) {
				System.out.println("Aluno " + (indiceI + 1) + " Nota: " + (indiceJ + 1) +  "");
				matriz[indiceI][indiceJ] = Leia.nextDouble();
			} 
			media = (matriz[indiceI][0] + matriz[indiceI][1] + matriz[indiceI][2] + matriz[indiceI][3]) / 4;
			System.out.println("A média do aluno " + (indiceI + 1) + " é: " + media);
		}
	}
}