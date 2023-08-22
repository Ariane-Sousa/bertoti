package strategy;

public class Desconto2000_2010 implements Desconto{
    @Override
    public void descontar(double preco) {
        preco = preco - (preco * 0.02);
        System.out.println(preco);
    }
}
