package programas;

import java.util.Map;
import java.util.TreeMap;

public class ProgamaMap {

	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		
		cookies.put("Usuario", "marta");
		cookies.put("email", "marta@gmail.com");
		cookies.put("phone", "9948612");
		
		cookies.remove("email");
		cookies.put("phone", "8899245612");
		System.out.println("Contem a chave 'phone': "+cookies.containsKey("phone"));
		System.out.println("Numero de telefone: "+cookies.get("phone"));
		System.out.println("Email: "+cookies.get("email"));
		System.out.println("Tamanho: "+cookies.size());
		System.out.println();
		for(String chave : cookies.keySet()) {
			System.out.println(chave+": "+cookies.get(chave));
		}
	}

}
