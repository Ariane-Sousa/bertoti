import java.util.LinkedList;
import java.util.List;

public class Oficina {
	
	private List<Maquina>maquinas = new LinkedList<Maquina>();
	private List<Setor>setores = new LinkedList<Setor>();

	public void cadastrarMaquina(Maquina maquina){
		maquinas.add(maquina);
	}
	
	public void cadastrarSetor(Setor setor){
		setores.add(setor);
	}
	
	public List<Maquina> getMaquina() {
		return maquinas;
	}

	public void setMaquina(List<Maquina> maquina) {
		this.maquinas = maquina;
	}
	
	public List<Setor> getSetor() {
		return setores;
	}

	public void setSetor(List<Setor> setor) {
		this.setores = setor;
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
  
  public Setor buscarSetorPorNome(String nome){
      for(Setor setor:setores){
           if(setor.getNome().equals(nome)) return setor; 
      }
      return null;
 }

  public List<Maquina> getOficina(){
        return maquinas;
  }

}
