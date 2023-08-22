package strategy;

public class Teste {

    public static void main(String[] args) {

        Locadora sertanejo = new Locadora();

        sertanejo.setPreco(22);
        sertanejo.setDesconto(new Desconto2010_2020());
        sertanejo.aplicarDesconto();

        sertanejo.setPreco(55);
        sertanejo.setDesconto(new Desconto2000_2010());
        sertanejo.aplicarDesconto();

    }

}