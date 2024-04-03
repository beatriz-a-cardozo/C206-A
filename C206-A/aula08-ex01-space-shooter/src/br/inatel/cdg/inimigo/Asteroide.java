package br.inatel.cdg.inimigo;

public class Asteroide {
    private String nome;
    private String tipoAsteroide;

    //---------------------------------------------------- MÉTODOS -----------------------------------------------------
    public void destruir() {
        System.out.println("O asteroide " + this.nome + " foi destruido!");
    }

    //--------------------------------------------------- CONSTRUTOR ---------------------------------------------------
    public Asteroide(String nome, String tipoAsteroide){
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }
    //----------------------------------------------- SETTERS & GETTERS ------------------------------------------------
    // nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // tipo de asteroide
    public String getTipoAsteroide() {
        return tipoAsteroide;
    }

    public void setTipoAsteroide(String tipoAsteroide) {
        this.tipoAsteroide = tipoAsteroide;
    }

}
