import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Declaração do Scanner
        Scanner entrada = new Scanner(System.in);

        // Declaração das variaveis
        int nota;
        int np3;
        float nfa;

        // Entrada da média do semestre
        System.out.println("Digite a sua média: ");
        nota = entrada.nextInt();

        // Caso sua média for maior ou igual a 60 -> Passou
        if(nota >= 60)
            System.out.println("Parabén! Boas Férias!");

        // Caso seja menor que 60 -> NP3
        else {
            System.out.println("Você está de NP3! Agora tem que estudar, boa sorte!");

            // Entrada da nota NP3
            System.out.println("Agora digite sua nota da NP3: ");
            np3 = entrada.nextInt();

            // Cálculo da média final
            nfa = (nota + np3) / 2.0f;

            // Caso sua média final for maior ou iguala  50 -> passou
            if (nfa >= 50)
                System.out.println("Passou! Agora começam suas férias!");

            // caso sua média final for menor que 50 -> pegou dp
            else {
                System.out.println("Nos vemos semestre que vem!");
            }
        }
        // encerra a entrada
        entrada.close();
    }
}
