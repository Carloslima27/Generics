package entidades;

public class Produtos implements Comparable<Produtos>{
	private String nome;
	private Double preco;
	
	public Produtos(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String toString() {
		return String.format("Nome: %s, Preco: %.2f", nome, preco);
	}

	@Override
	public int compareTo(Produtos outro) {
		return preco.compareTo(outro.getPreco());
	}
}
