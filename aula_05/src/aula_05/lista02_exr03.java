package aula_05;
import java.util.Scanner;

public class lista02_exr03 {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];


		for(int indiceI = 0; indiceI < matriz.length; indiceI ++) {
			for(int indiceJ = 0; indiceJ < matriz.length; indiceJ ++) {
				System.out.println("Matriz[" + indiceI + "][" + indiceJ + "]");
				matriz[indiceI][indiceJ] = Leia.nextInt();
			}
		
		}
		System.out.println("D. Principal: " + matriz[0][0] + " , " + matriz[1][1] + " , " + matriz[2][2]);
		System.out.println("D. Segundaria: " + matriz[0][2] + " , " + matriz[1][1] + " , " + matriz[2][0]);
		int somaPri;
		somaPri =  matriz[0][0] + matriz[1][1] + matriz[2][2];
		System.out.println("Soma D. Principal: " + somaPri);
		int somaSeg;
		somaSeg =  matriz[0][2] + matriz[1][1] + matriz[2][0];
		System.out.println("Soma D. Principal: " + somaSeg);
		
	}
		
	
}