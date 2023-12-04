public class Livro {
    private String titulo;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public double getPreco() {
        return preco;
    }

    public boolean matches(Livro livro) {
        return false;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}