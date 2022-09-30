package Cadastros;

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
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}
	
	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}

}
