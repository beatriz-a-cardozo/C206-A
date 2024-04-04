import java.util.Scanner;
public class Console extends Produto{
    private String geracao;
    private String marca;

    Scanner in = new Scanner(System.in);

    // ----- metodos -----
    public void jogar(){
        System.out.println("1 - Phasmophobia      2 - Overwatch");
        System.out.println("3 - Stardew Valley    4 - Hades");
        System.out.println("Selecione um jogo: ");

        int jogo = in.nextInt();

        switch(jogo){
            case 1:
                System.out.println("... Abrindo Phasmophobia");
                break;
            case 2:
                System.out.println("... Abrindo Overwatch");
                break;
            case 3:
                System.out.println("... Abrindo Stardew Valley");
                break;
            case 4:
                System.out.println("... Abrindo Hades");
                break;
        }
    }

    public void mostraInfo(){
        super.mostraInfo();
        System.out.println(this.marca + " da geracao " + this.geracao);
    }

    // ---- construtor ----
    public Console(double preco, String nome, String geracao, String marca) {
        super(preco, nome);
        this.geracao = geracao;
        this.marca = marca;
    }
}
