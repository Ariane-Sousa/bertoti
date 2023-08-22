package strategy;

public class DescontoMenor2000 implements Desconto{
    @Override
    public void descontar(double preco) {
        preco = preco - (preco * 0.05);
        System.out.println(preco);
    }
}
