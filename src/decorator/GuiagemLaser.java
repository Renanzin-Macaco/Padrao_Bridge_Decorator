package decorator;

import static decorator.TipoArma.*;

public class GuiagemLaser extends ArmaDecorator {
    public GuiagemLaser(Arma a) {
        super(a, "Guiagem a laser", BAZUCA);
    }

    @Override
    public int getAlcance() { return arma.getAlcance() + 80; }
}