package bridge;

public class NotificacaoCobranca extends Notificacao {
    private final double valor;
    private final String vencimento;

    public NotificacaoCobranca(Canal canal, double valor, String vencimento) {
        super(canal);
        this.valor = valor;
        this.vencimento = vencimento;
    }

    @Override
    public void notificar(String destinatario, String conteudo) {
        String msg = String.format("COBRANCA: %s | Valor: R$ %.2f | Vencimento: %s",
                conteudo, valor, vencimento);
        canal.enviar(destinatario, msg);
    }
}