import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi(); // cria um novo objeto - zumbi 1
        Zumbi z2 = new Zumbi(); // cria um novo objeto - zumbi 2

        int flag;
        double vidaTransferida;

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        // declarando informações do zumbi 1
        z1.nome = "ed";
        z1.vida = 2.6;

        // declarando informações do zumbi 2
        z2.nome = "peter";
        z2.vida = 6.2;

        System.out.println(z1);
        System.out.println(z2);
        System.out.println("Deseja realizar uma tranferência de vida? " +
                "Se sim, digite 1, caso contrário, digite 0");
        flag = entrada.nextInt();

        if (flag == 1) {
            System.out.println("Para qual zumbi deseja transferir vida? 1 ou 2?");
            flag = entrada.nextInt();
            System.out.println("Quanto de vida deseja transferir?");
            vidaTransferida = entrada.nextDouble();

            if(flag == 1) {
                if(z2.transfereVida(z1, vidaTransferida) == false)
                    System.out.println("Transferência inválida");

                else {
                    System.out.println(z1);
                    System.out.println(z2);
                }
            }

            else if(flag == 2) {
                if(z1.transfereVida(z2, vidaTransferida) == false)
                    System.out.println("Transferência inválida");

                else {
                    System.out.println(z1);
                    System.out.println(z2);
                }
            }

            else
                System.out.println("Zumbi inexistente!");
        }
    }
}
