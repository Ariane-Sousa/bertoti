import java.util.ArrayList;
import java.util.List;

class Tarefa {
    private List<ProgressObserver> observadores = new ArrayList<>();
    private String descricao;
    private int progresso;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.progresso = 0;
    }

    public void adicionarObservador(ProgressObserver observador) {
        observadores.add(observador);
    }

    public void removerObservador(ProgressObserver observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (ProgressObserver observador : observadores) {
            observador.update(this);
        }
    }

    public void atualizarProgresso(int novoProgresso) {
        this.progresso = novoProgresso;
        notificarObservadores();
    }

    public String getDescricao() {
        return descricao;
    }

    public int getProgresso() {
        return progresso;
    }
}