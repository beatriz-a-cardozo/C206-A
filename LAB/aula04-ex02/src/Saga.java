import java.util.Arrays;

public class Saga {

    private String titulo;
    private int nota;
    private Livro[] livros = new Livro[20];

    // ------------- METODOS -------------
    public void listarLivros() {
        for(Livro livroLista : livros) {
            if (livroLista != null)
                System.out.println(livroLista);
        }
    }

    public void adicionarLivro(Livro livro) {
        for(int i = 0; i < livros.length; i++) {
            if(livros[i] == null) {
                livros[i] = livro;
                break;
            }
        }
    }

    // ------------- CONSTRUTOR -----------

    public Saga(String titulo, int nota) {
        this.titulo = titulo;
        this.nota = nota;
    }

    public Saga(){

    }

    @Override
    public String toString() {
        return "Saga: " + this.titulo + " {" + '\n' +
                "nota=" + nota + '\n' +
                "LIVROS: " + Arrays.toString(livros) +
                '}';
    }

}
