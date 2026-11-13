package decorator;

import static decorator.TipoArma.*;

public class CargaRapida extends ArmaDecorator {
    public CargaRapida(Arma a) {
        super(a, "Carga rapida", PISTOLA, BAZUCA, METRALHADORA);
    }

    @Override
    public double getRecarga() { return arma.getRecarga() * 0.6; }
}