import java.util.ArrayList;
import java.util.List;

public class SistemaMensagem implements Subject{
    private List<Observer> observadores;
    private List<String> mensagens;

    public SistemaMensagem() {
        observadores = new ArrayList<>();
        mensagens = new ArrayList<>();
    }

    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar(getMensagem());
        }
    }

    public void novaMensagem(String mensagem) {
        mensagens.add(mensagem);
        notificarObservadores();
    }

    private String getMensagem() {
        int tamanhoLista = mensagens.size();
        return mensagens.get(tamanhoLista - 1);
    }
}
