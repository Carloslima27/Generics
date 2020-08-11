package entidades;

public class Urnas {
	private Integer votos ;

	
	public Urnas(Integer votos) {
		
		this.votos = votos;
	}

	public Integer getVotos() {
		return votos;
	}

	public void setVotos(Integer votos) {
		this.votos = votos;
	}

	
	public String toString() {
		return  String.format("%d",votos);
	}

	
	
	
}
