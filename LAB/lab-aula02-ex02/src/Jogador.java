public class Jogador {
    public Arma arma;
    public int energia;
    public int vida;

    // Construtor
    Jogador() {
    }
    Jogador (Arma arma, int energia, int vida) {
        this.arma = arma;
        this.energia = energia;
        this.vida = vida;
    }

    public void atacar(Jogador alvo) {
        if(this.energia >= this.arma.custoDeEnergia) {
            this.energia -= this.arma.custoDeEnergia;
            alvo.vida -= this.arma.dano;
            System.out.println("Ataque sucedido.");
        }

        else
            System.out.println("Fraco demais para atacar.");
    }

    public String toString() {
        return "Status da arma -> Dano: " + this.arma.dano + " Custo de energia: " + this.arma.custoDeEnergia +
                " Status do jogador -> Energia: " + this.energia + " Vida: " + this.vida;
    }
}
