package decorator;

import static decorator.TipoArma.*;

public class MunicaoIncendiaria extends ArmaDecorator {
    public MunicaoIncendiaria(Arma a) {
        super(a, "Municao incendiaria", PISTOLA, BAZUCA, METRALHADORA);
    }

    @Override
    public int getDano() { return (int) (arma.getDano() * 1.2); }
}