public class Main {

    public static void main(String[] args) {

        Banda banda1 = new Banda("5SOS", "pop-punk");

        Empresario empresario = new Empresario("Seu Madruga",1000021023);

        Musica musica1 = new Musica("Musica1", 3.4f);
        Musica musica2 = new Musica("Musica2", 4.2f);
        Musica musica3 = new Musica("Musica3", 6.2f);

        Membro membro1 = new Membro("Membro1", "Vocalista");
        Membro membro2 = new Membro("Membro2","Guitarrista");
        Membro membro3 = new Membro("Membro3","Baixista");

        //banda1.empresario = empresario;

        //Adicionando Musicas
        banda1.addMusica(musica1);
        banda1.addMusica(musica2);
        banda1.addMusica(musica3);

        //Adicionando Membros
        banda1.addMembro(membro1);
        banda1.addMembro(membro2);
        banda1.addMembro(membro3);

        System.out.println(banda1);

    }

}
