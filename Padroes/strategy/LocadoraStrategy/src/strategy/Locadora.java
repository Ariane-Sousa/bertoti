package strategy;

import java.util.Date;

public class Locadora {

    private String nomeCD;
    private Date dataLancamento;
    private Desconto desconto;
    private double preco;

    public String getNomeCD() {
        return nomeCD;
    }

    public void setNomeCD(String nomeCD) {
        this.nomeCD = nomeCD;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Desconto getDesconto() {
        return desconto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setDesconto(Desconto desc) {
        desconto = desc;
    }

    public void aplicarDesconto() {
        desconto.descontar(preco);
    }

}