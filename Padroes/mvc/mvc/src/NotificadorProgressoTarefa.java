class NotificadorProgressoTarefa {
    private NotificacaoStrategy estrategiaNotificacao;

    public void setEstrategiaNotificacao(NotificacaoStrategy estrategiaNotificacao) {
        this.estrategiaNotificacao = estrategiaNotificacao;
    }

    public void notificar(Tarefa tarefa) {
        estrategiaNotificacao.notificar(tarefa);
    }
}