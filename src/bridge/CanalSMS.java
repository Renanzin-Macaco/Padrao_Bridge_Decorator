package bridge;

public class CanalSMS implements Canal {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("[SMS]      Para: " + destinatario + " | " + mensagem);
    }
}