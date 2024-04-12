public class Empilhador extends Robo{

    Pacote[] pacotes = new Pacote[20];
    private int pesoMaximo = 50;
    private int somaPacotes = 0;

    public void adicionaPacote(int peso){
        somaPacotes = somaPacotes + peso;
        if(somaPacotes <= pesoMaximo){
            Pacote pacote = new Pacote();
            pacote.Pacote(peso);
            for(int i = 0; i < pacotes.length; i++){
                if(pacotes[i] == null){
                    pacotes[i] = pacote;

                    break;
                }
            }
        }

        else
            System.out.println("Não é possível adicionar esse pacote pois ultrapassa o limite de peso.");

    }

    public void removePacote(int posicao){
        pacotes[posicao] = null;
    }

    public void mostraPacotes(){
        for(Pacote pacote : pacotes){
            if(pacote != null)
                System.out.println(pacote);
        }
    }

    public Empilhador(int energia, String nome, int energiaMaxima, int pesoMaximo, Pacote[] pacote) {
        super(energia, nome, energiaMaxima);
        this.pesoMaximo = pesoMaximo;
        pacote = new Pacote[10];
    }

    public Empilhador(){

    }
}
