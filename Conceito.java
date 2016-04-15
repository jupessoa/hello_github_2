package br.edu.insper.apoio.modelo;


public class Conceito {
	private String nome;
	private double nota;
	
	public String getNome() {
		return nome;
	}

	public double getNota() {
		return nota;
	}

	public Conceito(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
}
