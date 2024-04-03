public class Album {

    private String nome;
    private int nota;

    Album(String nome, int nota){
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "(" + this.nome + ", " +
                this.nota + ")";
    }
}
