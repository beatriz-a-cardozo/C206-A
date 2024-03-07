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
            System.out.println("Aprovado!");
        else if(md >= 30)
            calculaNP3(md);
        else
            System.out.println("Reprovado!");

        return md;
    }

    public int calculaNP3 (int media) {
        Scanner entrada = new Scanner(System.in);
        int np3;

        System.out.println("Insira a nota da NP3: ");
        np3 = entrada.nextInt();

        media = (np3 + media) / 2;

        if(media >= 50)
            System.out.println("Aprovado!");
        else
            System.out.println("Reprovado!");

        return media;
    }
    public String toString(){
        return "Nome: " + this.nome + " Matrícula: " + this.matricula + " Periodo: " + this.periodo; //ALT + Insert cria essa linha automaticamente
    }
}
