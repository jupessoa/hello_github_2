package br.edu.insper.apoio.modelo;


public class Relatorio {
	private double minimo;
	private double maximo;
	private double media;
	
	public double getMinimo() {
		return minimo;
	}
	
	public double getMaximo() {
		return maximo;
	}
	
	public double getMedia() {
		return media;
	}
	
	public Relatorio(double minimo, double maximo, double media) {
		this.minimo = minimo;
		this.maximo = maximo;
		this.media = media;
	}
}
