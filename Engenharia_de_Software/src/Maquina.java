
public class Maquina {
	
	private String codigodecadastro;
	private Especificacao espec;
	
	public Maquina(String codigocadastro, Especificacao espec){
		this.codigodecadastro = codigocadastro;
		this.espec = espec;
	}
	
	public String getCodigodecadastro() {
		return codigodecadastro;
	}
	
	public void setCodigodecadastro(String novoCodigodecadastro) {
		this.codigodecadastro = novoCodigodecadastro;
	}
	
	public Especificacao getEspec() {
		return espec;
	}
	
	public void setEspec(Especificacao novaEspec) {
		this.espec = novaEspec;
	}
	

}
