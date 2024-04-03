import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Jogador player = new Jogador(new Arma(5, 3), 20, 28);
        Jogador boss = new Jogador(new Arma(4,1),25,50);

        int at;
        Scanner cin = new Scanner(System.in);

        System.out.println("Se deseja atacar, digite 1. Para descansar, digite 0.");
        at = cin.nextInt();

        while(at==1) {
            player.atacar(boss);

            System.out.println("Se deseja atacar, digite 1. Para descansar, digite 0.");
            at = cin.nextInt();
        }

        System.out.println(player);
        System.out.println(boss);
    }

}
