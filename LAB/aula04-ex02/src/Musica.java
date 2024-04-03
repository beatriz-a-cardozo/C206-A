public class Musica {
    private String nome;
    private String album;

    // -------------- GETTERS & SETTERS -------------
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }

    // ---------- Construtor -----------

    public Musica(String nome, String album) {
        this.nome = nome;
        this.album = album;
    }

    public String toString(){
        return this.nome + " ("
                + this.album + ")";
    }
}
