
public class Setor {
	
	private String nome;
	private String responsavel;
	
	public Setor(String nome, String responsavel) {
		this.nome = nome;
		this.responsavel = responsavel;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String novoResponsavel) {
		this.responsavel = novoResponsavel;
	}
	
	

}
