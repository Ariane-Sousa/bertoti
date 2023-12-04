public class TesteBibliotecaVirtual {

    public static void main(String[] args) {
        BibliotecaVirtual biblioteca = new BibliotecaVirtual();
        BibliotecaView bibliotecaView = new BibliotecaView();
        EmailNotificacao emailNotificacao = new EmailNotificacao();

        biblioteca.registerObserver(bibliotecaView);
        biblioteca.registerObserver(emailNotificacao);
        bibliotecaView.setDescontoStrategy(new DescontoDiaLivro());
        emailNotificacao.setBiblioteca(biblioteca);

        Livro livro1 = new Livro();
        livro1.setTitulo("Livro 1");
        livro1.setPreco(40.0);

        Livro livro2 = new Livro();
        livro2.setTitulo("Livro 2");
        livro2.setPreco(25.0);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
    }
}