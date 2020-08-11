package entidades;

import java.util.Set;
import java.util.TreeSet;

public class SetAula {

	public static void main(String[] args) {
		
		Set<PessoaComparaTree> set = new TreeSet<>();
		
		
		set.add(new PessoaComparaTree("Tv", 1000.0));
		set.add(new PessoaComparaTree("Notebook", 5000.0));
		set.add(new PessoaComparaTree("Computador", 7200.00));
		for(PessoaComparaTree x: set) {
			System.out.println(x);
		}
		
		

	}

}
