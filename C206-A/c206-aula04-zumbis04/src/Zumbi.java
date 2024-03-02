public class Zumbi {
    double vida;
    String nome;

    public double mostraVida() {
        return this.vida;
    }

    public boolean transfereVida(Zumbi zumbiAlvo, double quantia) {
        if (this.vida < quantia)
            return false;

        else {
            this.vida -= quantia;
            zumbiAlvo.vida += quantia;

            return true;
        }
    }

    public String toString() {
        return "A vida atual de " + this.nome + " é " +this.vida;
    }
}
