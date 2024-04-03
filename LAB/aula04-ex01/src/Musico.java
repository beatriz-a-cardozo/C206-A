public class Musico {

    private Album[] albums = new Album[10];
    private String nome;

    // ------ MÉTODOS ------
    public void listar(){
        for (Album album : albums) { // percorrendo um arrary (ou for(int i = 0; i < array.lenght; i++)
            if (album != null)
                System.out.println(album);
        }
    }

    public void adicionar(Album alb) {
        for(int i = 0; i < albums.length; i++) {
            if(albums[i] == null) {
               albums[i] = alb;
               break;
            }
        }
    }

    public void deletar(int posicao) {
        albums[posicao] = null;
    }

    // ------ CONSTRUTOR ------
    Musico(){
    }

    // ------ GETTERS & SETTERS ------
    public Album[] getAlbums() {
        return albums;
    }
    public void setAlbums(Album[] albums) {
        this.albums = albums;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
