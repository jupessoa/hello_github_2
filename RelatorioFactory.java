package br.edu.insper.apoio.modelo;


import java.util.List;


public class RelatorioFactory {
	
	public Relatorio criaRelatorio(List<Conceito> conceitos) {
		double minimo = 11;
		double maximo = -1;
		double soma = 0;
		
		for (Conceito conceito: conceitos) {
			soma += conceito.getNota();
			
			if (conceito.getNota() > maximo) {
				maximo = conceito.getNota();
			}
			
			if (conceito.getNota() < minimo) {
				minimo = conceito.getNota();
			}	
		}
		
		return new Relatorio(minimo, maximo, soma / conceitos.size());
	}
	
	public Relatorio criaRelatorioDeRelatorios(List<Relatorio> relatorios) {
		double minimo = 11;
		double maximo = -1;
		double soma = 0;
		double media;
				
		for(Relatorio relatorioAtual: relatorios) {			
			if(relatorioAtual.getMinimo() < minimo) {
				minimo = relatorioAtual.getMinimo();
			}			
			if(relatorioAtual.getMaximo() > maximo) {
				maximo = relatorioAtual.getMaximo();
			}			
			soma += relatorioAtual.getMedia();
		}
		
		media = soma / relatorios.size();
		
		Relatorio relatorio = new Relatorio(minimo, maximo, media);
		return relatorio;
	}
}
