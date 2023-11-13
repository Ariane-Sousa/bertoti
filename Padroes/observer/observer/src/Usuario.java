public class Usuario implements Observer {
    private String nome;
    private String mensagem;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void atualizar(String mensagens) {
        mensagem = mensagens;
        mostrar();
    }

    public void mostrar() {
        System.out.println("Usuário: " + nome + ", última mensagem: " + mensagem);
    }
}
