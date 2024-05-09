import java.util.Random;
public class Pirata {

    private String nome;
    private String comidaFavorita;
    private int poder;
    Random random = new Random();

    public void comer(Cozinheiro cozinheiro, int index){

        if(this.comidaFavorita.equalsIgnoreCase(cozinheiro.prepararPrato(index))){
            System.out.println(this.nome + "está comendo sua comida favorita!!!");
            poder = poder + 2;
        }

        else
            poder++;
    }

    public Pirata lutar(Pirata pirata){
        if(this.poder >= pirata.poder)
            return this;

        else
            return pirata;
    }

    public Pirata(){

    }

   public Pirata(String nome, String comidaFavorita, int poder){
        this.nome = nome;
        this.comidaFavorita =  comidaFavorita;
        this.poder = poder;
   }

    public String getNome() {
        return nome;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", comidaFavorita='" + comidaFavorita + '\'' +
                ", poder=" + poder + '\'';
    }
}
