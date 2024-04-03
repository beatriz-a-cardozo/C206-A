import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Musico musico = new Musico();

        musico.setNome("5 Seconds of Summer");

        Album a1 = new Album("5 Seconds of Summer", 67);
        Album a2 = new Album("Sounds Good Feels Good", 61);
        Album a3 = new Album("Youngblood", 63);
        Album a4 = new Album("CALM", 67);
        Album a5 = new Album("5SOS5", 80);

        musico.adicionar(a1);
        musico.adicionar(a2);
        musico.adicionar(a3);
        musico.adicionar(a4);
        musico.adicionar(a5);

        Scanner in = new Scanner(System.in);

        System.out.println("Os direitos de CALM foram vendidos, ele será removido");
        musico.deletar(3);

        System.out.println("Lista de album: ");
        musico.listar();
    }

}
