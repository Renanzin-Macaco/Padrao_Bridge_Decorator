package bridge;

public class CanalWhatsApp implements Canal {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("[WHATSAPP] Para: " + destinatario + " | " + mensagem);
    }
}