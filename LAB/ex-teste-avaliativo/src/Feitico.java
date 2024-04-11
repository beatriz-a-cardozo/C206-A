public class Feitico {
    //--------------------------------------------- declaração de variável ---------------------------------------------
    private String nome;
    private int poder;

    //-------------------------------------------------- construtores --------------------------------------------------
    public Feitico(String nome, int poder){
        this.nome = nome;
        this.poder = poder;
    }

    // ----------------------------------------------- setters & getters -----------------------------------------------
    // ----------------------- nome
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    // ----------------------- poder
    public void setPoder(int poder){
        this.poder = poder;
    }
    public int getPoder(){
        return poder;
    }

    // ------------------------------------------- saída de dados - toString -------------------------------------------
    public String toString(){
        return "(" + nome + ", nível de poder: " + poder + ")";
    }

}
