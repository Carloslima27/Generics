package servicos;

import java.util.List;

public class MaiorPreco{
	
	public static <T extends Comparable<? super T>> T max(List<T> e, List<T> c) {
		
		if(e.isEmpty()) {
			throw new IllegalStateException("Lista de eletronicos Vazia!");
		}else if(c.isEmpty()) {
			throw new IllegalStateException("Lista de calçados vazia");
		}
		T maior = e.get(0);
		for(T x: c) {
			if(x.compareTo(maior) > 0) {
				maior = x;
			}
		}
		
		return maior;
	}
public static <T extends Comparable<? super T>> T menor(List<T> e, List<T> c) {
		
		if(e.isEmpty()) {
			throw new IllegalStateException("Lista de eletronicos Vazia!");
		}else if(c.isEmpty()) {
			throw new IllegalStateException("Lista de calçados vazia");
		}
		T maior = e.get(0);
		for(T x: c) {
			if(x.compareTo(maior) < 0) {
				maior = x;
			}
		}
		
		return maior;
	}
	
	}

	

	

