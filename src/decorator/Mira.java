package decorator;

import static decorator.TipoArma.*;

public class Mira extends ArmaDecorator {
    public Mira(Arma a) {
        super(a, "Mira", PISTOLA, BAZUCA, METRALHADORA);
    }

    @Override
    public int getAlcance() { return arma.getAlcance() + 20; }
}