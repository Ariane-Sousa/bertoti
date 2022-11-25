
public class Especificacao {
	
	private String marca;
	private String modelo;
	private String numeroDeSerie;
	private String setor;
	
	
	public Especificacao(String marca, String modelo, String numeroDeSerie, String setor) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroDeSerie = numeroDeSerie;
		this.setor = setor;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String novaMarca) {
		this.marca = novaMarca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String novaModelo) {
		this.modelo = novaModelo;
	}
	
	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}
	
	public void setNumeroDeSerie(String novoNumeroDeSerie) {
		this.numeroDeSerie = novoNumeroDeSerie;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String novoSetor) {
		this.setor = novoSetor;
	}
	
	public boolean comparar(Especificacao especificacao){
		if(this.marca.equals(especificacao.marca) && this.modelo.equals(especificacao.modelo) 
			&& this.numeroDeSerie.equals(especificacao.numeroDeSerie) && this.setor.equals(especificacao.setor)){
			return true;
		} else {
			return false;
		}
	}


}
