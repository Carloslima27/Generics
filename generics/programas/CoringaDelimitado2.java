package programas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoringaDelimitado2 {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(2, 15, 7);
		List<Double> myDouble = Arrays.asList(3.5, 2.4);
		List<Object> myObject = new ArrayList<>();
		copia(myInts, myObject);
		imprimir(myObject);
		copia(myDouble, myObject);
		imprimir(myObject);
	
	}
	static void copia(List<? extends Number> fonte, List<? super Number> destino ) {
		for(Number f : fonte) {
			destino.add(f);
		}
		
	}
	static void imprimir(List<?> lista) {
		for(Object l: lista) {
			System.out.print(l+" ");
		}
		System.out.println();
	}

}
