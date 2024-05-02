import java.util.Arrays;

public class Equipe {
    // -------------------------------------------- declaração de variáveis --------------------------------------------
    private Carro carro;
    private Piloto[] pilotos = new Piloto[3];
    private Piloto pilotoAtual =  new Piloto();
    private String nome;

    // ---------------------------------------------------- métodos ----------------------------------------------------
    private boolean trocarPilotoAtual(int pilotoId){
        if(pilotos[pilotoId] != null){
            pilotoAtual = pilotos[pilotoId];

            return true;
        }

        else {
            System.out.println("id inválida!!");

            return false;
        }
    }

    private boolean trocarPneu(int tipoDePneu){
        if(tipoDePneu >= 1 && tipoDePneu <= 5){
            carro.setTipoDePneu(tipoDePneu);

            return true;
        }

        else
            return false;
    }

    public void pitStop(int tipoDePneu, int pilotoId){
        trocarPilotoAtual(pilotoId);
        trocarPneu(tipoDePneu);
    }

    public boolean adicionarPiloto(Piloto piloto){
        for(int i = 0; i < pilotos.length; i++){

            if(pilotos[i] == null){
                pilotos[i] = piloto;

                System.out.println("Piloto adicionado com sucesso!");

                return true;
            }

            else
                return false;

        }

        return false;
    }

    public boolean retirarPiloto(int pilotoId){
        if(pilotos[pilotoId] != null){
            pilotos[pilotoId] = null;

            return true;
        }

        else
            return false;
    }

    public void constroiCarro(int tipoDePneu, int potencia, boolean turbo){
        carro = new Carro(tipoDePneu, potencia, turbo);
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "carro=" + carro +
                ", pilotos=" + Arrays.toString(pilotos) +
                ", pilotoAtual=" + pilotoAtual +
                ", nome='" + nome + '\'' +
                '}';
    }

    //--------------------------------------------------- construtor ---------------------------------------------------
    public Equipe(String nome){
        this.nome = nome;
    }

    // ----------------------------------------------- getters & setters -----------------------------------------------

    public Piloto getPilotoAtual() {
        return pilotoAtual;
    }

    public void setPilotoAtual(Piloto pilotoAtual) {
        this.pilotoAtual = pilotoAtual;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
