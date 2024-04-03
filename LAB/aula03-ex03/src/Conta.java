public class Conta{

    private double saldo;
    private double limite;

    // ------------------------------------------------- CONSTRUTOR -------------------------------------------------
    Conta (double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }
    Conta() {

    }

    // ---------------------------------------------- SETTERS & GETTERS ----------------------------------------------
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double valor){
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String toString(){
        return "Conta{ " +
                "saldo= " + this.saldo +
                " limite= " + this.limite +
                " }";

    }

}
