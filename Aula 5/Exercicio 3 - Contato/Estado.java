package model;

public class Estado {
	
	private String nome;
	
	private String sigla;
	
	public Estado (String nome, String sigla) {
		this.nome = nome;
		this.sigla = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	
}
