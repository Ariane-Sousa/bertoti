public class TestaSistema {
    public static void main(String[] args) {
        SistemaMensagem app = new SistemaMensagem();

        Usuario alan = new Usuario("Alan");
        Usuario tobias = new Usuario("Tobias");
        Usuario vitoria = new Usuario("Vitoria");

        app.adicionarObservador(alan);
        app.adicionarObservador(tobias);
        app.novaMensagem("Olá, como vocês estão? (Alan)");

        app.adicionarObservador(vitoria);
        app.novaMensagem("Boa noite, existem três pessoas no grupo.");

        app.removerObservador(alan);
        app.novaMensagem("Bom dia, existem duas pessoas no grupo (Alan removido)");

        app.removerObservador(tobias);
        app.novaMensagem("Boa tarde, existe uma pessoa no grupo (Tobias removido)");

    }
}

