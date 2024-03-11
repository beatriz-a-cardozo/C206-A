public class Arma {
    public String nome;
    public int poder;
    public int resistencia;
    public String descricao;

    public void mostraInfoArmas(){
        System.out.println("Arma: " + nome +
                " Poder: " + poder +
                " Resistencia atual: " + resistencia +
                " Descricao: " + descricao);
    }
}
