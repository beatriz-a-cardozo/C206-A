import java.util.Arrays;

public class Banda {

    private String nome;
    private String genero;

    public Empresario[] empresario = new Empresario[1];
    public Musica[] musicas = new Musica[10];
    public Membro[] membros = new Membro[10];


    // Construtor
    public Banda (String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public void addMusica (Musica musica){
        for (int i = 0; i < musicas.length; i++) {
            if(musicas[i] == null){
                musicas[i] = musica;
                break;
            }
        }
    }

    public void addMembro (Membro membro) {
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] == null) {
                membros[i] = membro;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Banda{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", empresario=" + Arrays.toString(empresario) +
                ", musicas=" + Arrays.toString(musicas) +
                ", membros=" + Arrays.toString(membros) +
                '}';
    }

}
