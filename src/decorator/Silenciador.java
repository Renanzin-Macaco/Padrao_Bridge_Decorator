package decorator;

import static decorator.TipoArma.*;

public class Silenciador extends ArmaDecorator {
    public Silenciador(Arma a) {
        super(a, "Silenciador", PISTOLA, METRALHADORA);
    }

    @Override
    public int getRuido() { return Math.max(5, arma.getRuido() - 50); }
}