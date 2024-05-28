package exPratico;

import excecoes.CheckedException;

public class Twitter extends RedeSocial implements Compartilhamento{

    //--------------------------------------- métodos implementados da interface ---------------------------------------
    @Override
    public void compartilhar() {
        System.out.println("Retweetado");
    }

    // --------------------------------- métodos abstratos implementados da classe mãe ---------------------------------
    public void postarFoto(){
        System.out.println("Você acabou de twittar uma foto no Twitter");
    }

    public void postarVideo(){
        System.out.println("Você acabou de twittar um vídeo no Twitter");
    }

    public void postarComentario(){
        System.out.println("Você acabou de comentar em um tweet");
    }

    //--------------------------------------------------- CONSTRUTOR ---------------------------------------------------
    public Twitter(String senha, int numAmigos) throws CheckedException{
        super(senha, numAmigos);
    }

}
