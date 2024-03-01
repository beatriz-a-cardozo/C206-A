import java.util.Scanner;
public class Aluno {
    // declaração de variáveis
    public String nome;
    public int matricula;
    public int periodo;
    public int np1;
    public int np2;

    public int calculaMedia(){
        int md = (this.np1 + this.np2) / 2;

        if(md >= 60)
            return 0;
        else
            return calculaNP3(md);
    }

    public int calculaNP3 (int media) {
        Scanner entrada = new Scanner(System.in);
        int mdfinal;
        int np3;

        System.out.println("Insira a nota da NP3: ");
        np3 = entrada.nextInt();

        mdfinal = (np3 + media) / 2;

        if(mdfinal >= 50)
            return 0;
        else
            return 1;
    }
    public String toString(){
        return "Nome: " + this.nome + " Matrícula: " + this.matricula + " Periodo: " + this.periodo;
    }
}
