package strategy;

import java.util.Date;

public class Locadora {

    private String nomeCD;
    private Date dataLancamento;
    private Desconto desconto;
    private int preco;

    public String getNomeCD() {
        return nomeCD;
    }

    public void setNomeCD(String nomeCD) {
        this.nomeCD = nomeCD;
    }

    public void setDesconto(Desconto desc) { //Argumento polimorfico!!!! Forma de Voo, forma de Nado e etc
        desconto = desc;
    }

    public void aplicarDesconto() {
        desconto.descontar();
    }

}