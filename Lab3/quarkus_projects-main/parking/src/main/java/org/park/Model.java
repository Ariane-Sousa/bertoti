package org.park;


import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Model {
	
	private List<Album> albuns = new LinkedList<Album>();

	public Model() {
		addAlbum(new Album("5555-22", new Especificacao("I Love You", "The Neighbourhood", "2013")));
		addAlbum(new Album("5555-23", new Especificacao("Wiped Out", "The Neighbourhood", "2015")));
		addAlbum(new Album("5555-24", new Especificacao("Hard to Imagine", "The Neighbourhood", "2018")));
		addAlbum(new Album("5555-25", new Especificacao("#000000 & #FFFFFF", "The Neighbourhood", "2014")));
	}
	
	public void addAlbum(Album album){
		albuns.add(album);
	}
	
	public List<Album> buscarCodigo(String codigo) {
	    List<Album> albunsEncontrados = new ArrayList<>();

	    for (Album album : albuns) {
	        if (album.getCodigo().equals(codigo)) {
	            albunsEncontrados.add(album);
	        }
	    }

	    return albunsEncontrados;
	}

	
	public List<Album> buscarEspecificacao(Especificacao esp){
		List<Album> albunsEncontrados = new LinkedList<Album>();
		
		for(Album album:albuns){
			 if(esp.comparar(album.getEspc())) albunsEncontrados.add(album);
		}
		
		return albunsEncontrados;
		
	}
	
	
	public List<Album> buscarNome(String nome){
		List<Album> albunsEncontrados = new LinkedList<Album>();
		for(Album album:albuns) {
			if(album.getEspc().getNome().equals(nome)) albunsEncontrados.add(album);
		}
		return albunsEncontrados;
	}
	
	public List<Album> getAlbum(){
		return albuns;
	}

}
