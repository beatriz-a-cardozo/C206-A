public class Zumbi {
    double vida;
    String nome;

    public double mostraVida() {
        return this.vida;
    }

    public void transfereVida(Zumbi zumbiAlvo, double quantia) {
        if (this.vida < quantia)
            System.out.println("Transferência inválida!");

        else {
            this.vida -= quantia;
            zumbiAlvo.vida += quantia;
        }
    }
}
