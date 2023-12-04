class DescontoFerias implements DescontoStrategy {

    @Override
    public double calcularDesconto(double preco) {
        return 0.12 * preco; // 12% de desconto nas férias
    }
}