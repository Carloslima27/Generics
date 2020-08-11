package programas;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UniaoIntercecaoDiferenca {

	public static void main(String[] args) {
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 9));
		Set<Integer> b = new TreeSet<>(Arrays.asList(2, 7, 8 ,9, 10));
		
		//União
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		//Intercesão
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//Diferente
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}

}
