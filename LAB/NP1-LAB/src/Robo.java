public class Robo {

    // -------------------------------------------- declaração de variáveis --------------------------------------------
    private int energia;
    private String nome;
    private static int totalDeRobos = 0;
    private int energiaMaxima;

    // ---------------------------------------------------- métodos ----------------------------------------------------
    public void trabalhar(){
        this.energia = this.energia - 20;
    }

    public void trocarEnergia(Robo roboAlvo){
        if(this.energia >= 10){
            if(roboAlvo.energia <= 90){
                roboAlvo.energia = roboAlvo.energia + 10;
                this.energia = this.energia - 10;

                System.out.println("recarregado com sucesso");
            }
        }

        else
            System.out.println("energia insuficiente");
    }

    public void recarregar(int horas){
        for(int i = 0; i < horas; i++){
            if(this.energia >= energiaMaxima){
                this.energia = this.energia + 10;

                if(this.energia > energiaMaxima){
                    this.energia = energiaMaxima;

                    break;
                }
            }
            break;
        }
    }

    public Robo(int energia, String nome, int energiaMaxima) {
        this.energia = energia;
        this.nome = nome;
        this.energiaMaxima = energiaMaxima;

        totalDeRobos++;
    }

    // Sobrecarga
    public Robo(){

    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalDeRobos() {
        return totalDeRobos;
    }

    public int getEnergiaMaxima() {
        return energiaMaxima;
    }

    public void setEnergiaMaxima(int energiaMaxima) {
        this.energiaMaxima = energiaMaxima;
    }
}
