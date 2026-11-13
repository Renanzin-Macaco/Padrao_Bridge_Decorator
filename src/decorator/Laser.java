package decorator;

import static decorator.TipoArma.*;

public class Laser extends ArmaDecorator {
    public Laser(Arma a) {
        super(a, "Laser", PISTOLA, METRALHADORA);
    }

    @Override
    public int getAlcance() { return arma.getAlcance() + 10; }
}