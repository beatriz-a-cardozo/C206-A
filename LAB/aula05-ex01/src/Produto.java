// --- classe mae ---
public class Produto {

    private double preco;
    private String nome;

    // --- metodos ---
    public void mostraInfo(){
        System.out.println(this.nome + ": " + this.preco);
    }

    // --- construtor ---
    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

}
