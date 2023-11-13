class NotificacaoSMSStrategy implements NotificacaoStrategy {
    @Override
    public void notificar(Tarefa tarefa) {
        // Implementação do envio de notificação por SMS
        System.out.println("Notificação por SMS: Tarefa '" + tarefa.getDescricao() + "' atingiu " + tarefa.getProgresso() + "%");
    }
}