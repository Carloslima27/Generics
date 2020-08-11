package programas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import servicos.Circulo;
import servicos.Formas;
import servicos.Retangulo;

public class CoringaDelimitado {

	public static void main(String[] args) {
		List<Formas> formas = new ArrayList<>();
		formas.add(new Retangulo(3.0, 2.0));
		formas.add(new Circulo(2.0));
		System.out.println(soma(formas));
		List<Integer> inteiro = Arrays.asList(1, 7, 54);
		System.out.println(soma(inteiro));

	}
	static double soma(List<? extends Formas> formas) {
		double soma = 0.0;
		for(Formas x: formas) {
			soma += x.area();
		}
		return soma;
	}

}
