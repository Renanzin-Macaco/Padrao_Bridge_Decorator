package decorator;

import java.util.Arrays;

public abstract class ArmaDecorator implements Arma {
    protected final Arma arma;
    private final String nome;

    protected ArmaDecorator(Arma arma, String nome, TipoArma... compativeis) {
        if (!Arrays.asList(compativeis).contains(arma.getTipo())) {
            throw new IllegalArgumentException(
                    "Upgrade invalido: " + nome + " nao pode ser usado em " + arma.getTipo());
        }
        if (arma.getDescricao().contains(nome)) {
            throw new IllegalArgumentException("Upgrade ja instalado: " + nome);
        }
        this.arma = arma;
        this.nome = nome;
    }

    @Override public String getDescricao() { return arma.getDescricao() + " + " + nome; }
    @Override public TipoArma getTipo()    { return arma.getTipo(); }
    @Override public int getDano()         { return arma.getDano(); }
    @Override public int getAlcance()      { return arma.getAlcance(); }
    @Override public int getCapacidade()   { return arma.getCapacidade(); }
    @Override public double getRecarga()   { return arma.getRecarga(); }
    @Override public int getRuido()        { return arma.getRuido(); }
}