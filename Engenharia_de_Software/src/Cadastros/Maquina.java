package Cadastros;

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
	
	public void setCodigodecadastro(String codigodecadastro) {
		this.codigodecadastro = codigodecadastro;
	}
	
	public Especificacao getEspec() {
		return espec;
	}
	
	public void setEspec(Especificacao espec) {
		this.espec = espec;
	}
	

}
