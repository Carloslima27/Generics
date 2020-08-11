package programas;

import java.util.Arrays;
import java.util.List;

public class Coringa {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("maria", "Ana", "Emilly", "Henrique");
		printList(lista);
		System.out.println();
		List<Integer> lista1 = Arrays.asList(1, 6, 25, 7);
		printList(lista1);
	}
	public static void printList(List<?> lista) {
		for(Object x: lista) {
			System.out.print(" "+x);
		}
	}

}
