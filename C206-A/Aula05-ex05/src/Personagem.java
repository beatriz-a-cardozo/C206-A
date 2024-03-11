public class Personagem {
    public String nome;
    public int pontos;
    Arma arma;

    public void usarArmas(){
        this.arma.resistencia = arma.resistencia - 2;
    }

    public void tomarDano(){
        this.pontos = pontos - 5;
    }
}
