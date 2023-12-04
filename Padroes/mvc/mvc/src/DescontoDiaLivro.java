class DescontoDiaLivro implements DescontoStrategy {

    @Override
    public double calcularDesconto(double preco) {
        return 0.08 * preco; // 8% de desconto no Dia do Livro
    }
}