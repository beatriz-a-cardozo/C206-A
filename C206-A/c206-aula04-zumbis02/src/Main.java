public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi(); // cria um novo objeto - zumbi 1
        Zumbi z2 = new Zumbi(); // cria um novo objeto - zumbi 2

        // informações do zumbi 1
        z1.nome = "ed";
        z1.vida = 4.5;

        // informações do zumbi 2
        z2.nome = "pedro";
        z2.vida = 5.4;

        // saída de dados
        System.out.println("Antes de igualar as referências: ");
        z1.mostraVida();
        z2.mostraVida();

        z1 = z2; // igualando as referências

        // saida de dados
        System.out.println("Depois de igualar as referências: ");
        z1.mostraVida();
        z2.mostraVida();

        // refazendo as informações de z1
        z1.vida = 7.6;
        // refazendo as informações de z2
        z2.vida = 0.8;

        System.out.println("Verificando a vida deles: ");
        z1.mostraVida();
        z2.mostraVida();

        System.out.println("Após igualar as refências, z1 e z2 sempre seão iguais, pois" +
                " agora apontam para a mesma casa");
    }
}
