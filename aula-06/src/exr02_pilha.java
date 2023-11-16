import java.util.Scanner;
import java.util.Stack;

public class exr02_pilha {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		int op;
		String nomeadd, remover;

		do {
			System.out.println("Selecione op: 1,2,3,0");
			op = Leia.nextInt();
			switch (op) {
			case 1:
				System.out.println("Adicionar livro: ");
				Leia.nextLine();
				nomeadd = Leia.nextLine();
				pilha.add(nomeadd);
				System.out.println(pilha);
				break;
			case 2:
				System.out.println("Todos os livros: " + pilha);
				break;
			case 3:
				System.out.println("Remover qual livro: ");
				Leia.nextLine();
				remover = Leia.nextLine();
				pilha.remove(remover);
				System.out.println(pilha);
				break;
			}

		}while (op != 0);
		System.out.print("Selecionou 0. E Vc saiu do programa ");
	}
}
