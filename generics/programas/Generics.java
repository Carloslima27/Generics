package programas;

import java.util.Scanner;

import servicos.Imprimir;

public class Generics {

	public static  void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.print("Qual o tipo da lista: ");
		char r = Character.toUpperCase(leitor.next().charAt(0));
		System.out.print("Quantos valores: ");
		int n = leitor.nextInt();
		
		if(r == 'S') {
		 Imprimir<String>emp = new Imprimir<>();
		 leitor.nextLine();
		for(int i = 0; i < n; i++) {
		emp.addValor(leitor.nextLine());
		}
		emp.imprimir();
		System.out.println("Primeiro: "+emp.primeiro());
		}else {
		Imprimir<Integer> emp = new Imprimir<>();
		 for(int i = 0; i < n; i++) {
				emp.addValor(leitor.nextInt());
				}
		emp.imprimir();
		System.out.println("Primeiro: "+emp.primeiro());
		}
		
		
		
		
		leitor.close();
	}

	

}
