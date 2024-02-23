import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos tem na turma? ");
        int numAlunos = entrada.nextInt();

        switch(numAlunos) {
            case 10:
                System.out.println("sala I-16");
                break;
            case 20:
                System.out.println("sala I-16");
                break;
            case 30:
                System.out.println("sala I-22");
                break;
            default:
                System.out.println("numero invalido");
        }
    }
}
