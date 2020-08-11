package programas;

import java.util.HashSet;
import java.util.Set;

import entidades.Produtos1;

public class SetComparar {

	public static void main(String[] args) {
		Set<Produtos1> set = new HashSet<>();
		set.add(new Produtos1("Tv", 900.00));
		set.add(new Produtos1("Notebook", 1200.00));
		set.add(new Produtos1("Tablet", 400.00));
		
		Produtos1 prod = new Produtos1("Notebook", 1200.00);
		
		System.out.println(set.contains(prod));
	}

}
