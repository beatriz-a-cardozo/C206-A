import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Arma armaJogador = new Arma(20,4);
        Jogador jogador = new Jogador(armaJogador,25, 100);

        Arma armaBoss = new Arma(30,8);
        Jogador boss = new Jogador(armaBoss, 30, 200);

        int at;
        Scanner cin = new Scanner(System.in);

        System.out.println("Selecione 1 para atacar.");
        at = cin.nextInt();

        if(at == 1)
            jogador.atacar(boss);

        System.out.println(jogador);
    }
}
