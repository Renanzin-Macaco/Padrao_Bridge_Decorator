package decorator;

public interface Arma {
    String getDescricao();
    TipoArma getTipo();
    int getDano();
    int getAlcance();
    int getCapacidade();
    double getRecarga();
    int getRuido();
}