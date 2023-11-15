import java.util.ArrayList;
import java.util.Scanner;

public class exr01_list {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		String cor;
		for(int i = 0; i < 4; i ++) {
			System.out.println("Digite uma cor: ");
			cor = Leia.nextLine();
			cores.add(cor);
			
		}
	System.out.println(cores);
	}
}
