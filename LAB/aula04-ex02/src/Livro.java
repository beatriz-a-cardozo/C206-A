public class Livro {

    private String titulo;
    private int pagina;

    public Livro(String titulo, int pagina) {
        this.titulo = titulo;
        this.pagina = pagina;
    }

    public Livro(){

    }

    @Override
    public String toString() {
        return "'" + this.titulo +
                "', paginas: " +this.pagina
                + ".";
    }
}
