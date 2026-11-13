package bridge;

public abstract class Notificacao {
    protected final Canal canal;

    protected Notificacao(Canal canal) {
        this.canal = canal;
    }

    public abstract void notificar(String destinatario, String conteudo);
}