import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class hashh_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> frutas = new HashSet<String>();
		
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Abacate");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Jaboticaba");
		frutas.add("Kiiwi");
		
		System.out.println(frutas);
		//* calculos Hash Code
		
		
		
		for (var fruta : frutas ) {
			System.out.println(fruta.hashCode());
		};
		System.out.println("A fruta morango existe: " + frutas.contains("Morango"));
		
		frutas.remove("Morango");
		System.out.println(frutas);
		// criando interacao com iiterator
		Iterator<String> iFrutas = frutas.iterator();
		// hasnext interaator para collection, so sequencial
		while(iFrutas.hasNext()) 
			System.out.println(iFrutas.next());
		// Criamos Array list
		ArrayList<String> frutasList = new ArrayList<String>();
		// Adicionando elemento da colocao hashtag em arraylist
		frutasList.addAll(frutas);
		// ordenemos em ordem crescente
		frutasList.sort(null);
		System.out.println(frutasList);
		// em decrescente
		frutasList.sort(Comparator.reverseOrder());
		System.out.println(frutasList);
		
		
	}

}
