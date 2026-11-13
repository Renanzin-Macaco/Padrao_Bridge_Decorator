package decorator;

import static decorator.TipoArma.*;

public class CanoLongo extends ArmaDecorator {
    public CanoLongo(Arma a) {
        super(a, "Cano longo", PISTOLA, METRALHADORA);
    }

    @Override
    public int getAlcance() { return arma.getAlcance() + 25; }

    @Override
    public int getRuido() { return Math.min(100, arma.getRuido() + 5); }
}