package programas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import entidades.Logar;

public class Ativiade {

	public static void main(String[] args) throws ParseException {
		
		Set<Logar> log = new LinkedHashSet<>();
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String caminho = "C:\\Users\\Luzia\\Documents\\Texto Java\\log.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
			String linha = br.readLine();
			while(linha != null) {
				String[] divide = linha.split(" ");
				log.add(new Logar(divide[0], Date.from(Instant.parse(divide[1]))));
				linha = br.readLine();
			}
		
			System.out.println("Total de Usuarios: "+log.size());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
