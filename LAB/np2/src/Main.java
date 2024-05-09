import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Declaração das receitas
        ArrayList<Receita> sanjisCookBook = new ArrayList();
        Receita receita1 = new Receita("Parmegiana", 10);
        Receita receita2 = new Receita("Sushi", 9);
        Receita receita3 = new Receita("Hamburger", 8);
        Receita receita4 = new Receita("Churrasco", 7);
        Receita receita5 = new Receita("Pizza", 6);
        Receita receita6 = new Receita("Cupcake", 5);
        Receita receita7 = new Receita("Risoto", 4);
        Receita receita8 = new Receita("Martini", 3);
        Receita receita9 = new Receita("Cerveja", 2);
        Receita receita10 = new Receita("Bife", 1);

        // Adicionando as receitas no array
        sanjisCookBook.add(receita1);
        sanjisCookBook.add(receita2);
        sanjisCookBook.add(receita3);
        sanjisCookBook.add(receita4);
        sanjisCookBook.add(receita5);
        sanjisCookBook.add(receita6);
        sanjisCookBook.add(receita7);
        sanjisCookBook.add(receita8);
        sanjisCookBook.add(receita9);
        sanjisCookBook.add(receita10);

        // Declarando a tripulação
        Pirata luffy = new Capitão("Monkey D. Luffy", "Bife", 12, 5);
        Pirata sanji = new Cozinheiro("Sanji", "Risoto", 8, sanjisCookBook);
        Pirata zoro = new Espadachim("Roronoa Zoro", "Cerveja", 9, "Katana");
        Pirata robin = new Pirata("Nico Robin", "Martini", 10);
        Pirata ace = new Pirata("Monkey D. Ace", "Bife", 13);

        // -------------------------------------------- CHAMANDO OS MÉTODOS --------------------------------------------
        System.out.println("Durante uma luta em Alabasta, luffy, um capitão bem decidido, resolveu que " +
                "queria Nico Robin na sua atual tripulação, agora ele vai lutar contra ela, para ver se ela " +
                "vai ou não entrar para os piratas do chapéu de palha: ");

        ((Capitão) luffy).conquistarNovoSequidor(robin);

        System.out.println("Em um momento, perdido pelo deserto, ele acaba perdendo a razão e resolve " +
                "brigar com o seu irmão, vamos ver os dados do vencedor.");
        System.out.println(luffy.lutar(ace));

        System.out.println("Enquanto assiste a briga, zoro tem fomee da ordens para sanji cozinhar, e com a ajuda " +
                "de nami convence o sanji preparar algo pra comer.");
        ((Espadachim) zoro).darOrdens();
        zoro.comer(((Cozinheiro) sanji), 8);

        System.out.println("Robin fica curiosa sobre o que o sanji sabe e pergunta as receitas que ele sabe fazer.");
        ((Cozinheiro) sanji).mostrarReceitas();

        System.out.println("Depois da briga eles decidem continuar andandando, mas luffy tem uma idea");
        ((Capitão) luffy).mudarRota();
        System.out.println("Ninguém quer fazer o que ele pede");
        ((Capitão) luffy).darOrdens();

        System.out.println("Zoro tem uma ideia melhor");
        ((Espadachim) zoro).mudarRota();
    }
}
