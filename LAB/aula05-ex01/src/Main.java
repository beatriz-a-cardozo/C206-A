public class Main {

    public static void main(String[] args) {

        Notebook note = new Notebook(2609.10,"Ideapad S145", "Intel core i5", "1TB");
        Console ps5 = new Console(3499.90, "PlayStation 5", "9° geração","PlayStation");

        // mostrando as informações dos produtos
        note.mostraInfo();
        ps5.mostraInfo();

        // testando os produtos
        note.instalarAplicativo();
        ps5.jogar();

    }

}
