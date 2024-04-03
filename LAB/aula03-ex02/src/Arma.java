public class Arma {

    private int dano;
    private int custoDeEnergia;

    // Construtor
    Arma (int dano, int custoDeEnergia) {
        this.dano = dano;
        this.custoDeEnergia = custoDeEnergia;
    }

    // Getter
    public int getDano() {
        return dano;
    }
    public int getCustoDeEnergia() {
        return custoDeEnergia;
    }

}
