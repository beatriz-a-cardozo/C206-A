public class Main {

    public static void main(String[] args) {

        // ---- AUTOR e seu componentes: rick riordan ----
        Autor rick = new Autor("Rick Riordan");

        Saga pjo = new Saga("Percy Jackson e os Olimpianos", 8);
        Saga hdo = new Saga("Herois do Olimpo", 6);

        Livro pjo1 = new Livro("O Ladrao de Raios",400);
        Livro pjo2 = new Livro("O Mar de Monstros", 304);
        Livro pjo3 = new Livro("A Maldicao do Tita", 336);
        Livro pjo4 = new Livro("A Batalha do Labirinto", 392);
        Livro pjo5 = new Livro("O Ultimo Olimpiano", 384);
        Livro pjo6 = new Livro("O Calice dos Deuses", 272);

        Livro hdo1 = new Livro("O Heroi Perdido", 440);
        Livro hdo2 = new Livro("O Filho de Netuno", 432);
        Livro hdo3 = new Livro("A Marca de Atena", 480);
        Livro hdo4 = new Livro("A Casa de Hades", 496);
        Livro hdo5 = new Livro("O Sangue do Olimpo", 432);

        pjo.adicionarLivro(pjo1);
        pjo.adicionarLivro(pjo2);
        pjo.adicionarLivro(pjo3);
        pjo.adicionarLivro(pjo4);
        pjo.adicionarLivro(pjo5);
        pjo.adicionarLivro(pjo6);

        hdo.adicionarLivro(hdo1);
        hdo.adicionarLivro(hdo2);
        hdo.adicionarLivro(hdo3);
        hdo.adicionarLivro(hdo4);
        hdo.adicionarLivro(hdo5);

        rick.adicionarSaga(pjo);
        rick.adicionarSaga(hdo);

        // ---- BANDA e seu componentes: rick riordan ----
        Banda fivesos = new Banda("5 Seconds of Summer", 4);

        Musica sos1 = new Musica("She Looks So Perfect", "5 Seconds of Summer");
        Musica sos2 = new Musica("Youngblood", "Youngblood");
        Musica sos3 = new Musica("Amnesia", "5 Seconds of Summer");
        Musica sos4 = new Musica("She's Kinda Hot", "Sounds Good Feels Good");
        Musica sos5 = new Musica("Easier", "CALM");
        Musica sos6 = new Musica("Want You Back", "Youngblood");
        Musica sos7 = new Musica("Lie to Me", "Youngblood");
        Musica sos8 = new Musica("Heartbreak Girl", "5 Seconds of Summer");
        Musica sos9 = new Musica("Outer Space/Carry On", "Sounds Good Feels Good");
        Musica sos10 = new Musica("Jet Black Heart", "Sounds Good Feels Good");

        fivesos.adicionarMusica(sos1);
        fivesos.adicionarMusica(sos2);
        fivesos.adicionarMusica(sos3);
        fivesos.adicionarMusica(sos4);
        fivesos.adicionarMusica(sos5);
        fivesos.adicionarMusica(sos6);
        fivesos.adicionarMusica(sos7);
        fivesos.adicionarMusica(sos8);
        fivesos.adicionarMusica(sos9);
        fivesos.adicionarMusica(sos10);

        fivesos.tocarMusica(8);
        fivesos.tocarShow();

        rick.mostraInfo();
    }

}
