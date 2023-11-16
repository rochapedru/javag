import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class exr04_set {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		HashSet<Integer> valores = new HashSet<Integer>();
		
		int num,numi;
		
		for(int i = 0; i <= 9; i ++) {
			System.out.println("Digite um numero: ");
			num = Leia.nextInt();
			valores.add(num);
		
		}
		System.out.println(valores);
		for(int i = 0; i <= 9; i ++) {
			System.out.println("Qual deseja procurar: ");
			numi = Leia.nextInt();

			if (valores.contains(numi)) {
				System.out.println("O numero " + numi + " foi encontrado");
			}
			if (!valores.contains(numi)){
				System.out.println("O numero " + numi + " não foi encontradona");
			}
			
		}
		
	}
}
