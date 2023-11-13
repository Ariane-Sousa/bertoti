import java.util.ArrayList;
import java.util.List;

class Projeto implements ProjetoComponente {
    private String nome;
    private List<ProjetoComponente> tarefas = new ArrayList<>();

    public Projeto(String nome) {
        this.nome = nome;
    }

    public void adicionarTarefa(ProjetoComponente tarefa) {
        tarefas.add(tarefa);
    }

    @Override
    public void exibir() {
        System.out.println("Projeto: " + nome);
        for (ProjetoComponente tarefa : tarefas) {
            tarefa.exibir();
        }
    }
}