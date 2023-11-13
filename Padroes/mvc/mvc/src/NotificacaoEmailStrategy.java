class NotificacaoEmailStrategy implements NotificacaoStrategy {
    @Override
    public void notificar(Tarefa tarefa) {
        // Implementação do envio de notificação por e-mail
        System.out.println("Notificação por e-mail: Tarefa '" + tarefa.getDescricao() + "' atingiu " + tarefa.getProgresso() + "%");
    }
}