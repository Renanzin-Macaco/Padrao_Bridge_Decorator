package bridge;

public class NotificacaoUrgente extends Notificacao {
    public NotificacaoUrgente(Canal canal) {
        super(canal);
    }

    @Override
    public void notificar(String destinatario, String conteudo) {
        canal.enviar(destinatario, "*** URGENTE *** " + conteudo.toUpperCase());
    }
}