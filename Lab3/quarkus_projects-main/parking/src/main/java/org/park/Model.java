package org.park;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<Album> albuns = new LinkedList<Album>();

	public Model() {
		addAlbum(new Album("5555-22", new Especificacao("I Love You", "The Neighbourhood", "2013")));
	}
	
	public void addAlbum(Album album){
		albuns.add(album);
	}
	
	public Album buscarCodigo(String codigo){
		for(Album album:albuns){
			if(album.getCodigo().equals(codigo)) return album;
		}
		
		return null;
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
