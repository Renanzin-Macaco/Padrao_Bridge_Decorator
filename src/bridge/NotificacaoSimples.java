package bridge;

public class NotificacaoSimples extends Notificacao {
    public NotificacaoSimples(Canal canal) {
        super(canal);
    }

    @Override
    public void notificar(String destinatario, String conteudo) {
        canal.enviar(destinatario, conteudo);
    }
}