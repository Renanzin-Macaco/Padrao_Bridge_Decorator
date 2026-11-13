package decorator;

import static decorator.TipoArma.*;

public class TamborDeMunicao extends ArmaDecorator {
    public TamborDeMunicao(Arma a) {
        super(a, "Tambor de municao", METRALHADORA);
    }

    @Override
    public int getCapacidade() { return arma.getCapacidade() + 50; }

    @Override
    public double getRecarga() { return arma.getRecarga() + 1.0; }
}