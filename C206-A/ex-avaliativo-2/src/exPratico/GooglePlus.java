package exPratico;

import excecoes.CheckedException;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{

    //--------------------------------------- métodos implementados da interface ---------------------------------------
    @Override
    public void fazStreaming() {
        System.out.println("Você está ao vivo no GooglePlus!");
    }
    public void compartilhar(){
        System.out.println("Compartilhado no GooglePlus");
    }

    // --------------------------------- métodos abstratos implementados da classe mãe ---------------------------------
    public void postarFoto(){
        System.out.println("Você acabou de postar uma foto no GooglePlus");
    }

    public void postarVideo(){
        System.out.println("Você acabou de postar um vídeo no GooglePlus");
    }

    public void postarComentario(){
        System.out.println("Você acabou de comentar em um post no GooglePlus");
    }

    //--------------------------------------------------- CONSTRUTOR ---------------------------------------------------
    public GooglePlus(String senha, int numAmigos) throws CheckedException {
        super(senha, numAmigos);
    }
}
