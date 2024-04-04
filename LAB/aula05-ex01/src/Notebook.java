import java.util.Scanner;
public class Notebook extends Produto {
    private String processador;
    private String memoria;

    Scanner in = new Scanner(System.in);

    // ---- metodos ----
    public void instalarAplicativo(){
        System.out.println("----- microsoft store -----");
        System.out.println("busca: ");
        String busca = in.next();
        System.out.println(".................instalando");
        System.out.println(busca + " instalado!");
    }

    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("memoria de " + this.memoria +
                " e processador " + this.processador);
    }

    // ---- construtor ----
    public Notebook(double preco, String nome, String processador, String memoria) {
        super(preco, nome);
        this.processador = processador;
        this.memoria = memoria;
    }
}
