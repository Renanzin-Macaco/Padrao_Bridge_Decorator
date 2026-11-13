package decorator;

public class Main {
    static void imprimir(Arma a) {
        System.out.println(a.getDescricao());
        System.out.printf("  Dano: %d | Alcance: %d | Municao: %d | Recarga: %.1fs | Ruido: %d%n%n",
                a.getDano(), a.getAlcance(), a.getCapacidade(), a.getRecarga(), a.getRuido());
    }

    public static void main(String[] args) {
        Arma pistola = new Pistola();
        pistola = new Silenciador(pistola);
        pistola = new Mira(pistola);
        pistola = new PenteEstendido(pistola);
        imprimir(pistola);

        Arma bazuca = new Bazuca();
        bazuca = new OgivaFragmentacao(bazuca);
        bazuca = new GuiagemLaser(bazuca);
        bazuca = new CargaRapida(bazuca);
        imprimir(bazuca);

        Arma metra = new MunicaoIncendiaria(
                new TamborDeMunicao(
                        new EmpunhaduraVertical(
                                new Metralhadora())));
        imprimir(metra);

        try {
            Arma invalida = new Silenciador(new Bazuca());
            imprimir(invalida);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}