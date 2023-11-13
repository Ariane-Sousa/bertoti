class TarefaIndividual implements ProjetoComponente {
    private Tarefa tarefa;

    public TarefaIndividual(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void exibir() {
        System.out.println("Tarefa: " + tarefa.getDescricao() + " - Progresso: " + tarefa.getProgresso() + "%");
    }
}