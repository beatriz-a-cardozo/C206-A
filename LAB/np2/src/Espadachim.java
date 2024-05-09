public class Espadachim extends Pirata implements Comandar{

    private String nomeDaEspada;

    public void darOrdens(){
        System.out.println("O imediato está ordenando os tripulantes");
    }

    public void mudarRota(){
        System.out.println("O imediato está mudando de rota");
    }

    public Espadachim(String nome, String comidaFavorita, int poder, String nomeDaEspada){
        super(nome, comidaFavorita, poder);
        this.nomeDaEspada = nomeDaEspada;

    }

    @Override
    public String toString() {
        return "Espadachim{" +
                super.toString() +
                "nomeDaEspada='" + nomeDaEspada + '\'' +
                '}';
    }
}
