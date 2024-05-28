package exPratico;

import excecoes.CheckedException;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{

    //--------------------------------------- métodos implementados da interface ---------------------------------------
    @Override
    public void fazStreaming() {
        System.out.println("Você está ao vivo no Facebook!");
    }
    public void compartilhar(){
        System.out.println("Compartilhado no Facebook");
    }

    // --------------------------------- métodos abstratos implementados da classe mãe ---------------------------------
    public void postarFoto(){
        System.out.println("Você acabou de postar uma foto no Facebook");
    }

    public void postarVideo(){
        System.out.println("Você acabou de postar um vídeo no Facebook");
    }

    public void postarComentario(){
        System.out.println("Você acabou de comentar em um post no Facebook");
    }

    //--------------------------------------------------- CONSTRUTOR ---------------------------------------------------
    public Facebook(String senha, int numAmigos) throws CheckedException {
        super(senha, numAmigos);
    }

}
