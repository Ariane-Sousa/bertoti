package org.park;

public class Especificacao {

	private String nome;
	private String cantor;
	private String ano;	
	
	public Especificacao(String nome, String cantor, String ano){
		this.nome = nome;
		this.cantor = cantor;
		this.ano = ano;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getCantor(){
		return cantor;
	}
	
	public String getAno(){
		return ano;
	}
	
	
	public boolean comparar(Especificacao esp){
		if(nome.equals(esp.nome) && cantor.equals(esp.cantor) && ano.equals(esp.ano)){
			return true;
		} else {
			return false;
		}
	}
	
}
