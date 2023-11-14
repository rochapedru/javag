import java.util.LinkedList;
import java.util.Queue;


public class fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Aline");
		fila.add("Pedro");
		fila.add("Vinicius");
		fila.add("Luiza");
		fila.add("Maria");
		
		System.out.println(fila);
		
		fila.remove();
		
		System.out.println(fila);
		
		fila.peek();
		
		System.out.print(fila.peek());
		
		System.out.println(fila);
		
		System.out.println("A maria esta na fila: " + fila.contains("Maria"));
	
		System.out.println("Numero de elementos na fila " + fila.size());
	
		int contador = 0;
	
		
		for (var pessoa : fila) {
			contador ++;
			if(pessoa.equalsIgnoreCase("Maria"))
				System.out.println("Posicao de maria: " + contador);
		}
		
	}


}
