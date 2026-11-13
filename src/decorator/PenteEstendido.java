package decorator;

import static decorator.TipoArma.*;

public class PenteEstendido extends ArmaDecorator {
    public PenteEstendido(Arma a) {
        super(a, "Pente estendido", PISTOLA, METRALHADORA);
    }

    @Override
    public int getCapacidade() { return arma.getCapacidade() + 15; }
}