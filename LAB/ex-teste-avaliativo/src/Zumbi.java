import java.util.Random;

public class Zumbi extends Monstro{
    //--------------------------------------------- declaração de variável ---------------------------------------------
    private int numeroDeCerebrosComidos;

    Random random = new Random();

    // ---------------------------------------------------- métodos ----------------------------------------------------
    public void atacarComMordida(Monstro monstroAlvo){

        if(super.getEnergia() >= 5){

            int defesa;
            int ataque;

            System.out.println(monstroAlvo.getClass() + " tem o direito de rodar um dado de defesa.");
            defesa = random.nextInt(10);

            System.out.println("Resultado..." + defesa);

            ataque = numeroDeCerebrosComidos * (10 - defesa);

            monstroAlvo.setVida(monstroAlvo.getVida() - ataque);
            System.out.println("Dano causado: " + ataque);

            if(ataque >= 10)
                numeroDeCerebrosComidos++;

            super.setEnergia(super.getEnergia() - 5);

        }

        else
            System.out.println("Sem energia para isso.");

    }

    //-------------------------------------------------- construtores --------------------------------------------------
    public Zumbi(int idade, int vida, int energia, int numeroDeCerebrosComidos){
        super(idade, vida, energia);
        this.numeroDeCerebrosComidos = numeroDeCerebrosComidos;
    }

    // ----------------------------------------------- setters & getters -----------------------------------------------
    // ----------------------- numeros de cérebros comidos
    public void setNumeroDeCerebrosComidos(int numeroDeCerebrosComidos) {
        this.numeroDeCerebrosComidos = numeroDeCerebrosComidos;
    }
    public int getNumeroDeCerebrosComidos() {
        return numeroDeCerebrosComidos;
    }

    // -------------------------------------------------- mostra info --------------------------------------------------
    public void mostraInfo(){
        System.out.println("ZUMBI --------------------------------------------");
        System.out.println("[IDADE: " + super.getIdade() + ", VIDA: "
                + super.getVida() + " ENERGIA: " + super.getEnergia()
                + " Num. DE CEREBROS: " + numeroDeCerebrosComidos + "]");

    }

}
