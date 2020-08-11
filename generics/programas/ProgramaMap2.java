package programas;

import java.util.HashMap;
import java.util.Map;

import entidades.ProdutosMap;

public class ProgramaMap2 {

	public static void main(String[] args) {
		Map<ProdutosMap, Double> stock = new HashMap<>();
		
		ProdutosMap p1 = new ProdutosMap("Tv",900.00);
		ProdutosMap p2 = new ProdutosMap("Notebook",700.00);
		ProdutosMap p3 = new ProdutosMap("Iphone", 3300.00);
		
		stock.put(p1, 1000.00);
		stock.put(p2, 500.00);
		stock.put(p3, 100.00);
		
		ProdutosMap ps = new ProdutosMap("Iphone", 3300.00);
		
		System.out.println("Contem a chave 'ps: "+stock.containsKey(ps));
		for(ProdutosMap st: stock.keySet()) {
			System.out.println(st+": "+stock.get(st));
		}
	}

}
