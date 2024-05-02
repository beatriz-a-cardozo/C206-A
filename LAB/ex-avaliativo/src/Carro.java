public class Carro {
    // -------------------------------------------- declaração de variáveis --------------------------------------------
    private Motor motor;
    private int tipoDePneu;

    // ---------------------------------------------------- métodos ----------------------------------------------------
    public void correr(){
        System.out.println("correndo com a potencia de " + motor.getPotencia());
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor=" + motor +
                ", tipoDePneu=" + tipoDePneu +
                '}';
    }

    //--------------------------------------------------- construtor ---------------------------------------------------
    public Carro(int tipoDePneu, int potencia, boolean turbo){
        this.tipoDePneu = tipoDePneu;
        motor = new Motor(potencia, turbo);
    }

    public Carro(){

    }

    // ----------------------------------------------- getters & setters -----------------------------------------------
    public int getTipoDePneu() {
        return tipoDePneu;
    }

    public void setTipoDePneu(int tipoDePneu) {
        this.tipoDePneu = tipoDePneu;
    }
}
