class SistemaCasaInteligente {
    private Luzes luzes;
    private Termostato termostato;
    private SistemaSeguranca sistemaSeguranca;

    public SistemaCasaInteligente() {
        luzes = new Luzes();
        termostato = new Termostato();
        sistemaSeguranca = new SistemaSeguranca();
    }

    public void ligarCasa() {
        luzes.ligar();
        termostato.ligar();
        sistemaSeguranca.ligar();
        System.out.println("Casa ligada");
    }

    public void desligarCasa() {
        luzes.desligar();
        termostato.desligar();
        sistemaSeguranca.desligar();
        System.out.println("Casa desligada");
    }
}