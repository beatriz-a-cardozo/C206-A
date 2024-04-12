public class Pacote {

    private int peso;

    public void Pacote(int peso){
        this.peso = peso;
    }

    public Pacote(){

    }

    @Override
    public String toString() {
        return "Pacote ->" +
                "peso=" + peso +
                "kg";
    }
}
