import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exr01_fila {
	static Scanner Leia = new Scanner(System.in);

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		int op;
		String nomeadd, remover;

		do {
			System.out.println("Selecione op: 1,2,3,0");
			op = Leia.nextInt();
			switch (op) {
			case 1:
				System.out.println("Adicionar: ");
				Leia.nextLine();
				nomeadd = Leia.nextLine();
				fila.add(nomeadd);
				System.out.println(fila);
				break;
			case 2:
				System.out.println("Todos os clientes são: " + fila);
				break;
			case 3:
				System.out.println("Remover: ");
				Leia.nextLine();
				remover = Leia.nextLine();
				fila.remove(remover);
				System.out.println(fila);
				break;
			}

		}while (op != 0);
		
		System.out.print("Selecionou 0. E Vc saiu do programa ");
	}

}