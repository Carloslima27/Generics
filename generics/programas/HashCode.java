package programas;

import entidades.Cliente;

public class HashCode {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("maria", "Maria@gmail.com");
		Cliente c2 = new Cliente("maria", "Maria@gmail.com");
		String s1 = "ana";
		String s2 = "ana";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);
		System.out.println(c1.getNome());

	}

}
