public class Main {
    public static void main(String[] args) {
        Personagem p1 =  new Personagem();
        Arma arma1 = new Arma();

        p1.nome = "xxxx";
        p1.pontos = 50;
        p1.arma = arma1;

        arma1.nome = "hellfire";
        arma1.poder = 8;
        arma1.resistencia = 16;
        arma1.descricao = "lanca chamas";

        p1.usarArmas();
        p1.tomarDano();
        arma1.mostraInfoArmas();
    }
}
