package strategy;

public class Desconto2010_2020 implements Desconto{
    @Override
    public void descontar(double preco) {
        preco = preco - (preco * 0.025);
        System.out.println(preco);
    }
}
