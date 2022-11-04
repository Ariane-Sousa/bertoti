package Cadastros;

import java.util.LinkedList;
import java.util.List;

public class Oficina {
	private List<Maquina>maquinas = new LinkedList<Maquina>();

	public void cadastrarmaquina(Maquina maquina){
		maquinas.add(maquina);
	}
	
	public List<Maquina> getMaquina() {
		return maquinas;
	}

	public void setMaquina(List<Maquina> maquina) {
		this.maquinas = maquina;
	}
	
	public List<Maquina> buscarMaquinaPorEspecificacao(Especificacao espec){
        List<Maquina> maquinasEncontradas = new LinkedList<Maquina>();
        for(Maquina maquina:maquinas){
             if(maquina.getEspec().comparar(espec)) maquinasEncontradas.add(maquina);
        }
        return maquinasEncontradas;
  }

  public Maquina buscarMaquinaPorNumeroDeCadastro(String codigodecadastro){
       for(Maquina maquina:maquinas){
            if(maquina.getCodigodecadastro().equals(codigodecadastro)) return maquina; 
       }
       return null;
  }

  public List<Maquina> getOficina(){
        return maquinas;
  }
}

	