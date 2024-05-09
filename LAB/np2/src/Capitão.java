public class Capitão extends Pirata implements Comandar{

    private int numeroDeSeguidores;

    public void conquistarNovoSequidor(Pirata pirata){
        if(this.getPoder() > pirata.getPoder()){
            System.out.println("Agora " + pirata.getNome() + " faz parte da tripulação!");
            numeroDeSeguidores++;
        }
        else
            System.out.println("Capitão foi derrotado.");
    }

    public void darOrdens(){
        System.out.println("O capitão está ordenando " + numeroDeSeguidores + " tripulantes");
    }

    public void mudarRota(){
        System.out.println("O capitão está mudando de rota");
    }

    public Capitão(String nome, String comidaFavorita, int poder, int numeroDeSeguidores){
        super(nome, comidaFavorita, poder);
        this.numeroDeSeguidores = numeroDeSeguidores;
    }

    @Override
    public String toString() {
        return "Capitão{" +
                super.toString() +
                "numeroDeSeguidores=" + numeroDeSeguidores +
                '}';
    }
}
