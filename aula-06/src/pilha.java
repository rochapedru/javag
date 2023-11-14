import java.util.Stack;

public class pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<String>();
		
		pilha.add("Aline");
		pilha.add("Pedro");
		pilha.add("Vinicius");
		pilha.add("Luiza");
		pilha.add("Maria");
		
		System.out.println(pilha);
		
		pilha.pop();
		//* remove o ultimo elemento
		//* ja a fila remove o priimeiro elemento
		System.out.println(pilha);
		
		System.out.println(pilha);
		// removi maria
		System.out.println("o elemento que ta no topo: " + pilha.peek());
		
		System.out.println("A aline esta na pilha: " + pilha.contains("Aline"));
	}

}
