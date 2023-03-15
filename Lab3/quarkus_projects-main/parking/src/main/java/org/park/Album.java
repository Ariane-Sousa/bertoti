package org.park;

public class Album {

	private String codigo;
	private Especificacao espc;
	
	
	public Album(String codigo, Especificacao espc){
		this.codigo = codigo;
		this.espc = espc;
		
	}
	
	public String getCodigo(){
		return this.codigo;
	}
	
	public Especificacao getEspc(){
		return espc;
	}
	
	
}
