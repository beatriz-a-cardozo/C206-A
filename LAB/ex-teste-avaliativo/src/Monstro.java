// classe mãe!
public class Monstro {
    //--------------------------------------------- declaração de variável ---------------------------------------------
    private int idade;
    private int vida;
    private int energia;

    // ---------------------------------------------------- métodos ----------------------------------------------------
    public void assustar(Monstro monstroAlvo){
        System.out.println(monstroAlvo.getClass() + " esta assustado!");
    }

    //-------------------------------------------------- construtores --------------------------------------------------
    public Monstro(int idade, int vida, int energia){
        this.idade = idade;
        this.vida = vida;
        this.energia = energia;
    }

    public Monstro(){}

    // ----------------------------------------------- setters & getters -----------------------------------------------
    // ----------------------- idade
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }

    // ----------------------- vida
    public void setVida(int vida){
        this.vida = vida;
    }
    public int getVida(){
        return vida;
    }

    // ----------------------- energia
    public void setEnergia(int energia){
        this.energia = energia;
    }
    public int getEnergia(){
        return energia;
    }

    // -------------------------------------------------- mostra info --------------------------------------------------
    public void mostraInfo(){
        System.out.println("[IDADE: " + idade + ", VIDA: "
                + vida + " ENERGIA: " + energia + "]");
    }

}
