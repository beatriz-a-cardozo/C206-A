public class Piloto {
    // -------------------------------------------- declaração de variáveis --------------------------------------------
    private String nome;
    private int idade;
    private String nacionalidade;
    private static int idGeral;
    private int id;

    // ---------------------------------------------------- métodos ----------------------------------------------------
    public void correr(Carro carro){
        carro.correr();
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", id=" + id +
                '}';
    }

    //--------------------------------------------------- construtor ---------------------------------------------------
    public Piloto(String nome, int idade, String nacionalidade){
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;

        id = idGeral;
        idGeral++;
    }

    public Piloto(){
    }

}
