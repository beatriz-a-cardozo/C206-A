public class Jogador {

    private Arma arma;
    private int energia;
    private int vida;

    public void atacar(Jogador alvo){

        if(this.energia >= this.arma.getCustoDeEnergia()){
            this.energia -= this.arma.getCustoDeEnergia();
            alvo.vida -= this.arma.getDano();

            System.out.println("Ataque sucedido!");
        }

        else
            System.out.println("Cansado demais para atacar");

    }

    Jogador(){
    }

    Jogador(Arma arma, int energia, int vida){
        this.arma = arma;
        this.energia = energia;
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Jogador{ " +
                "arma { energia = " +
                arma.getCustoDeEnergia() +
                " dano = " + arma.getDano() +
                " }, energia = " + energia +
                ", vida = " + vida +
                " }";
    }

}
