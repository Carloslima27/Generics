package programas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import entidades.Candidatos;
import entidades.Urnas;

public class ServicoLeitor {

		
	
	static void leitor() {
		Map<Candidatos, Urnas> votacao = new LinkedHashMap<>();
		String caminho = "C:\\Users\\Luzia\\Documents\\Texto Java\\votacao.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
			String linha = br.readLine();
			while(linha != null) {
				String[] separa = linha.split(",");	
				String nome = separa[0];
				int votos = Integer.parseInt(separa[1]);
				
				
				if(votacao.containsKey(new Candidatos(nome))) {
					votacao.put(new Candidatos(nome), new Urnas(votos + votacao.get(new Candidatos(nome)).getVotos()) );
					
				}else {
					votacao.put(new Candidatos(nome), new Urnas(votos));
				}
				
				linha = br.readLine();
			}
			for(Candidatos c: votacao.keySet()) {
				System.out.println(c+": "+votacao.get(c));
			}
			
			
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo Nao encontrado!");
		}catch(IOException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		
	}
}
