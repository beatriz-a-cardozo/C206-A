import java.util.Random;
public class Bruxa extends Monstro{
    //--------------------------------------------- declaração de variável ---------------------------------------------
    private Feitico[] feiticos = new Feitico[20];
    Random random = new Random();

    // ---------------------------------------------------- métodos ----------------------------------------------------
    // -------- adicionando um novo feitiço a lista
    public boolean aprenderFeitico(String nome, int poder){

        boolean aux = false;

        for(int i = 0; i < feiticos.length; i++){

            if(feiticos[i] == null){
                Feitico feitico = new Feitico(nome, poder);
                feiticos[i] = feitico;

                System.out.println("Feitico " + feiticos[i].getNome() + " aprendido!");

                aux = true;
                break;
            }

        }

        if(aux)
            return true;

        else
            return false;

    }

    // -------- mostra todos os fetiços pertencentes a esse objeto da classe bruxa
    public void listarFeiticos(){

        for(Feitico feitico : feiticos){
            if(feitico != null)
                System.out.println(feitico);
        }

    }

    // -------- remove feticos desse objeto
    public void esquecerFeitico(int posicao){
        if(feiticos[posicao] != null){
            System.out.println("Por falta de prática, o feitiço " +
                    feiticos[posicao].getNome() + " foi esquecido!");

            feiticos[posicao] = null;
        }

        else
            System.out.println("Nao existe um feitico nessa posicao.");
    }

    // opção de atacar um inimigo de sua escolha (um inimigo seria uma das outras classes)
    public void lancarFeitico(Monstro monstroAlvo, int posicao){

        int defesa;
        int ataque;

        if(feiticos[posicao] != null){
            if(super.getEnergia() >= 5){

                System.out.println(monstroAlvo.getClass() + " é atacado.");
                System.out.println("Ele jogará um dado de sorte para ver seu nível de defesa.");

                defesa = random.nextInt(10);

                System.out.println(monstroAlvo.getClass() + "se defende com uma força de " + defesa);

                ataque = feiticos[posicao].getPoder() / defesa;

                monstroAlvo.setVida(monstroAlvo.getVida() - ataque);

                super.setEnergia(super.getEnergia()-5);

                System.out.println("Dano causado: " + ataque);

            }

            else
                System.out.println("A Bruxa está sem energia para isso.");
        }

        else
            System.out.println("feitico invalido.");

    }

    public void addFeitico(Feitico feitico){
        for(int i = 0; i < feiticos.length; i++){
            if(feiticos[i] == null){
                feiticos[i] = feitico;
                break;
            }
        }
    }

    //-------------------------------------------------- construtores --------------------------------------------------
    public Bruxa(int idade, int vida, int energia){
        super(idade, vida, energia);
        Feitico[] feiticos = new Feitico[20];
    }

    // -------------------------------------------------- mostra info --------------------------------------------------
    public void mostraInfo(){
        System.out.println("Bruxa --------------------------------------------");
        super.mostraInfo();
        this.listarFeiticos();
    }

}
