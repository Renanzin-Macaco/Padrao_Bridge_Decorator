package decorator;

public abstract class ArmaBase implements Arma {
    private final String nome;
    private final TipoArma tipo;
    private final int dano, alcance, capacidade, ruido;
    private final double recarga;

    protected ArmaBase(String nome, TipoArma tipo, int dano, int alcance,
                       int capacidade, double recarga, int ruido) {
        this.nome = nome;
        this.tipo = tipo;
        this.dano = dano;
        this.alcance = alcance;
        this.capacidade = capacidade;
        this.recarga = recarga;
        this.ruido = ruido;
    }

    @Override public String getDescricao() { return nome; }
    @Override public TipoArma getTipo()    { return tipo; }
    @Override public int getDano()         { return dano; }
    @Override public int getAlcance()      { return alcance; }
    @Override public int getCapacidade()   { return capacidade; }
    @Override public double getRecarga()   { return recarga; }
    @Override public int getRuido()        { return ruido; }
}