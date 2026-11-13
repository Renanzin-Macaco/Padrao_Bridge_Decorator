package bridge;

public class Main {
    public static void main(String[] args) {
        Notificacao n1 = new NotificacaoSimples(new CanalEmail());
        n1.notificar("ana@email.com", "Seu pedido foi enviado.");

        Notificacao n2 = new NotificacaoUrgente(new CanalSMS());
        n2.notificar("83 99999-0000", "Atividade suspeita na sua conta.");

        Notificacao n3 = new NotificacaoCobranca(new CanalWhatsApp(), 149.90, "20/11/2026");
        n3.notificar("83 98888-1111", "Fatura do mes");

        Notificacao n4 = new NotificacaoUrgente(new CanalWhatsApp());
        n4.notificar("83 97777-2222", "Servidor fora do ar.");
    }
}