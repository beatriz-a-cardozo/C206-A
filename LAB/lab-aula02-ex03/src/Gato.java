public class Gato {
    public String cor;
    public int idade;
    public int velocidade;

    public void brincar() {
        System.out.println("Brincando!");
    }

    public void caçar(Rato rato) {
        this.rato = rato;
        if((this.velocidade > this.rato.velocidade) && this.rato.escondido == false)
            System.out.println("Rato capturado.");
        else
            System.out.println("Rato escapou.");
    }

    public String toString(){
        return "Cor: " + this.cor + " Idade: " + this.idade + " Velocidade: " + this.velocidade;
    }
}
