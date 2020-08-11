package testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entidades.Calsados;
import entidades.Eletronicos;
import entidades.Produtos;
import servicos.MaiorPreco;

public class ProgramaTest {

	public static void main(String[] args) {
		List<Produtos> eletronico = new ArrayList<>();
		List<Produtos> calcados = new ArrayList<>();
		
		String caminho = "C:\\Users\\Luzia\\Documents\\Texto Java\\produtos.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
				String linha = br.readLine();
				while(linha != null) {
					if(linha.equals("Calcados")) {
						linha = br.readLine();
						while(linha != null) {
							String[] separar = linha.split(",");
							calcados.add(new Calsados(separar[0], Double.parseDouble(separar[1])));
							linha = br.readLine();
						}	
					}
					if(linha != null) {
					String[] separa = linha.split(",");
					eletronico.add(new Eletronicos(separa[0], Double.parseDouble(separa[1])));
					linha = br.readLine();
					}
				}
				System.out.println("Maior Preço: "+MaiorPreco.max(eletronico, calcados));
				System.out.println();
				System.out.println("Menor Preco: "+MaiorPreco.menor(eletronico, calcados));
				caminho = "C:\\Users\\Luzia\\Documents\\Texto Java\\Aquivo.csv";
				try( BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {
					for(Produtos x: eletronico) {
						bw.write(x.getNome()+","+x.getPreco());
						bw.newLine();
					}
					
				}catch(IOException e) {
					e.printStackTrace();
				}
				
		}catch(IOException e) {
			
		}catch(IllegalStateException e) {
			System.out.println(e.getMessage());
		}

	}

}
