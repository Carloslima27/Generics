package entidades;

public class PessoaComparaTree implements Comparable<PessoaComparaTree>{
	private String nome;
	private Double preco;

	public PessoaComparaTree(String nome, Double preco) {
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
	

	@Override
	public String toString() {
		return "PessoaComparaTree [nome=" + nome + ", Preco=" +preco + "]";
	}

	@Override
	public int compareTo(PessoaComparaTree outro) {
		return nome.toUpperCase().compareTo(outro.getNome().toUpperCase());
	}

	
	
	
}
