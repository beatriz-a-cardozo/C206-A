package br.inatel.cdg.jogador;
import br.inatel.cdg.inimigo.Asteroide;

public class Nave {

    private String nome;
    private double vida;
    private String tipoTiro;
    private static int chances = 12;

    //----------------------------------------------------- METÓDOS ----------------------------------------------------
    public void atirar(Asteroide ast) {
        if(this.vida > 0) {
            if (ast.getTipoAsteroide().equals("Pequeno")) {
                this.vida--;
                ast.setNome("destruido");
            }
            else {
                if(this.tipoTiro.equals("Explosivo")) {
                    this.vida--;
                    ast.setNome("destruido");
                }
                else
                    System.out.println("Esse asteroide é grande demais para ser destruido.");
            }
        }
        else
            System.out.println("A nave " + this.nome + " está sem energia e se retirou da batalha.");

    }

    //--------------------------------------------------- CONSTRUTOR ---------------------------------------------------
    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    //----------------------------------------------- SETTERS & GETTERS ------------------------------------------------
    // nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    // vida
    public double getVida(){
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    // tipo de tiro
    public String getTipoTiro() {
        return tipoTiro;
    }

    public void setTipoTiro(String tipoTiro) {
        this.tipoTiro = tipoTiro;
    }
}
