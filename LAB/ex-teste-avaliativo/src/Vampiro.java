import java.util.Random;

public class Vampiro extends Monstro{
    //--------------------------------------------- declaração de variável ---------------------------------------------
    private int medidorDeSangue;
    private boolean formaDeMorcego;

    Random random = new Random();

    // ---------------------------------------------------- métodos ----------------------------------------------------
    // faz com que o vampiro se transforme pra forma inversa da que está agora (humano ou morcego)
    public void transformar(){

        if(super.getEnergia() >= 2){
                this.formaDeMorcego = !formaDeMorcego;
        }

    }

    // função que aumenta a vida do vampiro caso necessário
    public void recuperarVida(){

        System.out.println("Rodando o dado para ver seu nível de recuperação de sangue por feitiço ou mordida.");

        int rec = random.nextInt(10);

        System.out.println("Resultado...." + rec);
        super.setVida(super.getVida() + medidorDeSangue / rec);

    }

    // vampiro ataca algum outro mosntro e suga seu sangue
    public void atacarComMordida(Monstro monstroAlvo){

        if(super.getEnergia() >= 5){

            int defesa;
            int ataque;

            System.out.println(monstroAlvo.getClass() + " tem o direito de rodar um dado de defesa.");
            defesa = random.nextInt(10);

            System.out.println("Resultado..." + defesa);

            ataque = 10 - defesa;

            monstroAlvo.setVida(monstroAlvo.getVida() - ataque);
            medidorDeSangue = medidorDeSangue + ataque  * 10;

            System.out.println("Dano causado: " + ataque);

            if(medidorDeSangue >= 100)
                this.recuperarVida();

            super.setEnergia(super.getEnergia() - 5);

        }

        else
            System.out.println("Sem energia para isso.");

    }

    //-------------------------------------------------- construtores --------------------------------------------------
    public Vampiro(int idade, int vida, int energia, int medidorDeSangue, boolean formaDeMorcego){
        super(idade, vida, energia);
        this.medidorDeSangue = medidorDeSangue;
        this.formaDeMorcego = formaDeMorcego;
    }

    // ----------------------------------------------- setters & getters -----------------------------------------------
    // ----------------------- medidor de sangue
    public void setMedidorDeSangue(int medidorDeSangue){
        this.medidorDeSangue = medidorDeSangue;
    }
    public int getMedidorDeSangue(){
        return medidorDeSangue;
    }

    // ----------------------- forma de morcego
    public void setFormaDeMorcego(boolean formaDeMorcego){
        this.formaDeMorcego = formaDeMorcego;
    }
    public boolean isFormaDeMorcego(){
        return formaDeMorcego;
    }

    // -------------------------------------------------- mostra info --------------------------------------------------
    public void mostraInfo(){
        System.out.println("VAMPIRO --------------------------------------------");
        System.out.println("[IDADE: " + super.getIdade() + ", VIDA: "
                + super.getVida() + " ENERGIA: " + super.getEnergia()
                + " Med. DE SANGUE: " + medidorDeSangue + " FORMA ATUAL: "
                + formaDeMorcego + "]");

    }

}
