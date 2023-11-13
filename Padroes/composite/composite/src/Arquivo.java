class Arquivo implements ComponenteArquivo {
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.println("Arquivo: " + nome);
    }
}