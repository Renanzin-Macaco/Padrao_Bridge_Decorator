package bridge;

public class CanalEmail implements Canal {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("[E-MAIL]   Para: " + destinatario + " | " + mensagem);
    }
}