package programas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Produtos;
import servicos.MaiorPreco;

public class ProgramaMaiorPreco {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produtos> p = new ArrayList<>();
		String caminho = "C:\\Users\\Luzia\\Documents\\Texto Java\\produtos.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
			String linha = br.readLine();
			while(linha != null) {
				String[] separa = linha.split(",");
				p.add(new Produtos(separa[0], Double.parseDouble(separa[1])));
				linha = br.readLine();
				
			}
			
			System.out.println(MaiorPreco.max(p));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
