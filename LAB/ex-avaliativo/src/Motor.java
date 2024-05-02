public class Motor {
    // -------------------------------------------- declaração de variáveis --------------------------------------------
    private int potencia;
    private boolean turbo;

    // ---------------------------------------------------- métodos ----------------------------------------------------
    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                ", turbo=" + turbo +
                '}';
    }

    //--------------------------------------------------- construtor ---------------------------------------------------
    public Motor(int potencia, boolean turbo){
        this.potencia = potencia;
        this.turbo = turbo;
    }

    // ----------------------------------------------- getters & setters -----------------------------------------------
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isTurbo() {
        return turbo;
    }

}
