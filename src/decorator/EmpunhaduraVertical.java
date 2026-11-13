package decorator;

import static decorator.TipoArma.*;

public class EmpunhaduraVertical extends ArmaDecorator {
    public EmpunhaduraVertical(Arma a) {
        super(a, "Empunhadura vertical", METRALHADORA);
    }

    @Override
    public int getAlcance() { return arma.getAlcance() + 10; }
}