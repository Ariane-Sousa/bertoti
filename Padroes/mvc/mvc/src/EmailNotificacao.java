import java.util.List;

public class EmailNotificacao implements Observer {
    private BibliotecaVirtual biblioteca;

    @Override
    public void update(List items) {
        System.out.println("Enviando e-mail de notificação para o cliente.");
    }

    public void setBiblioteca(BibliotecaVirtual biblioteca) {
        this.biblioteca = biblioteca;
    }
}