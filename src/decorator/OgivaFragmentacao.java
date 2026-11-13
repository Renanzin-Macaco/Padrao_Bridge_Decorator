package decorator;

import static decorator.TipoArma.*;

public class OgivaFragmentacao extends ArmaDecorator {
    public OgivaFragmentacao(Arma a) {
        super(a, "Ogiva de fragmentacao", BAZUCA);
    }

    @Override
    public int getDano() { return arma.getDano() + 150; }

    @Override
    public int getAlcance() { return arma.getAlcance() - 20; }
}