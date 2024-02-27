import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        int x; // número gerado
        int y; // palpite do usuário

        // declara o scanner - entrada de dados
        Scanner palpiteUser  = new Scanner (System.in);

        // número aleatório
        Random rand = new Random();
        x  = rand.nextInt(10) + 1; // Gera número entre 1 e 10

        // adivinhação
        do {
            System.out.println("Qual número estou pensando? ");
            y = palpiteUser.nextInt();
            // errou o número
            if(y!=x) {

                if(x < y)
                    System.out.print("Chutou alto! O meu número é menor que esse. ");

                else
                    System.out.print("Chutou baixo! O meu número é maior que esse. ");

                System.out.println("Tente novamente!");
            }

            else
                System.out.println("Parabéns! Você é um mestre da adivinhação!");

        } while (x!=y);
    }
}
