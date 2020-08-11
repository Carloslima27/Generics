package programas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Set<Integer> curso = new HashSet<>();
		System.out.print("Quantos alunos no curso A: ");
		addAluno(leitor, curso);
		System.out.print("Quantos alunos no curso B: ");
		addAluno(leitor, curso);
		System.out.print("Quantos alunos no curso C: ");
		addAluno(leitor, curso);
		System.out.println("Total de estudantes: "+curso.size());
	
			leitor.close();
	}
	static void addAluno(Scanner leitor, Set<Integer> curso) {
		int n = leitor.nextInt();
		for(int i = 0; i < n; i ++) {
			curso.add(leitor.nextInt());
			
		}
	}
}
