public class Main {

    public static void main(String[] args) {

        Equipe equipe = new Equipe("relampago");
        Piloto piloto1 = new Piloto("Jota", 28, "brasileiro");
        Piloto piloto2 = new Piloto("Haga", 28, "alemão");
        Piloto piloto3 = new Piloto("Gue", 28, "italiano");
        Piloto piloto4 = new Piloto("Ze", 28, "chileno");
        Piloto piloto5 = new Piloto("Fe", 32, "japones");

        System.out.println(piloto1);
        System.out.println(piloto2);
        System.out.println(piloto3);

        equipe.constroiCarro(4, 12, true);

        equipe.adicionarPiloto(piloto1);
        equipe.adicionarPiloto(piloto2);
        equipe.adicionarPiloto(piloto3);
        equipe.adicionarPiloto(piloto4);

        equipe.retirarPiloto(2);

        equipe.adicionarPiloto(piloto5);

        equipe.getPilotoAtual().correr(equipe.getCarro());

        equipe.pitStop(2,2);

        System.out.println(equipe);

    }

}
