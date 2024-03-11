public class Main {
    public static void main(String[] args) {

        Piloto piloto1 = new Piloto();
        Kart kart1 = new Kart();

        piloto1.nome = "Matt";
        piloto1.vilao = false;
        piloto1.kart = kart1;

        kart1.nome = "Relampago McQueen";
        kart1.motor.cilindradas = "....";
        kart1.motor.velocidadeMaxima = 300.68f;

        Piloto piloto2 = new Piloto();
        Kart kart2 = new Kart();

        piloto2.nome = "Damon";
        piloto2.vilao =  true;
        piloto2.kart = kart2;

        kart2.nome = "Herby";
        kart2.motor.cilindradas = "..";
        kart2.motor.velocidadeMaxima = 140.25f;

        // Piloto 2 rouba o kart do piloto 1;
        piloto2.kart = piloto1.kart;
        piloto2.kart.motor.mostraInfo();

        piloto1.kart = null;
        piloto1.kart.motor.mostraInfo();
    }
}
