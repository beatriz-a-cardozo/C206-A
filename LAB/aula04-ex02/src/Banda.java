import java.util.Random;
public class Banda {

    private Musica[] musicas = new Musica[9];
    private String nome;
    private int numeroDeIntegrantes;

    // ------------- METODOS -------------
    public void tocarMusica(int posicao){
        System.out.println("tocando: " + musicas[posicao]);
    }

    public void tocarShow(){
        System.out.println("tocando ao vivo: ");

        Random random = new Random();

        System.out.println(musicas[random.nextInt(9)]);
        System.out.println(musicas[random.nextInt(9)]);
        System.out.println(musicas[random.nextInt(9)]);
        System.out.println(musicas[random.nextInt(9)]);
        System.out.println(musicas[random.nextInt(9)]);
    }

    public boolean adicionarMusica(Musica musica){
        for(int i = 0; i < musicas.length; i++) {
            if(musicas[i] == null) {
                musicas[i] = musica;

                break;
            }
        }

        return true;
    }

    public boolean deletarMusica(String nome){
        for(int i = 0; i < musicas.length; i++) {
            if(musicas[i] != null){
                if(musicas[i].getNome().equalsIgnoreCase(nome))
                    musicas[i] = null;
            }
        }
        return true;
    }

    // ------------- CONSTRUTOR -------------
    public Banda(String nome, int numeroDeIntegrantes){
        this.nome = nome;
        this.numeroDeIntegrantes = numeroDeIntegrantes;
    }
}
