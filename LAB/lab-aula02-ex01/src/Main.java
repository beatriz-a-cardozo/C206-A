// Exercício corrigido no lab
import java.util.Scanner;
// - é public
// + é private
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(); // novo objeto
        Scanner entrada = new Scanner(System.in);

        // entrada de dados
        System.out.println("Insira o nome do aluno: ");
        aluno.nome = entrada.next();

        System.out.println("Insira a matrícula do aluno: ");
        aluno.matricula = entrada.nextInt();

        System.out.println("Insira o periodo do aluno: ");
        aluno.periodo = entrada.nextInt();

        System.out.println("Insira a nota da NP1: ");
        aluno.np1 = entrada.nextInt();

        System.out.println("Insira a nota da NP2: ");
        aluno.np2 = entrada.nextInt();

        aluno.calculaMedia();

        System.out.println(aluno);
    }
}
