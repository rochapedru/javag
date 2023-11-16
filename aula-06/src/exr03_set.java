import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class exr03_set {
	static Scanner Leia = new Scanner(System.in);
	public static void main(String[] args) {
		HashSet<Integer> valores = new HashSet<Integer>();
		
		int num;
		
		for(int i = 0; i <= 9; i ++) {
			System.out.println("Digite um numero: ");
			num = Leia.nextInt();
			if (!valores.contains(num)) {
				valores.add(num);
			}
		}
		ArrayList<Integer> numList = new ArrayList<Integer>();
		Iterator<Integer> z = valores.iterator();
		while(z.hasNext()) {
			numList.add(z.next());
		}
		numList.sort(null);
		System.out.println(numList);
	}
}
