package decorator;

import static decorator.TipoArma.*;

public class MunicaoPerfurante extends ArmaDecorator {
    public MunicaoPerfurante(Arma a) {
        super(a, "Municao perfurante", PISTOLA, METRALHADORA);
    }

    @Override
    public int getDano() { return arma.getDano() + 10; }
}