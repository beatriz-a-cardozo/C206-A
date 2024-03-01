public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();

        gato.cor = "Verde";
        gato.idade = 3;
        gato.velocidade = 10;

        Rato rato = new Rato();

        rato.escondido = true;
        rato.velocidade = 9;

        gato.caçar(rato);

        rato.procurarComida();

        gato.caçar(rato);

        System.out.println(rato);
        System.out.println(gato);
    }
}