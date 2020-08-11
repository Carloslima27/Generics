package servicos;

import java.awt.geom.IllegalPathStateException;
import java.util.ArrayList;
import java.util.List;

public class Imprimir <T> {
	private List<T> lista = new ArrayList<>();
	public void addValor(T valor) {
		lista.add(valor);
		
	}

	public T primeiro() {
		if(lista.isEmpty()) {
			throw new IllegalPathStateException("Lista Vazia");
		}
		return lista.get(0);
	}

	public void imprimir() {
		System.out.println(lista);
	}

	

	
	
}
