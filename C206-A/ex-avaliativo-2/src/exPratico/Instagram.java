package exPratico;

import excecoes.CheckedException;

public class Instagram extends RedeSocial{

    // --------------------------------- métodos abstratos implementados da classe mãe ---------------------------------
    public void postarFoto(){
        System.out.println("Você acabou de postar uma foto no Instagram");
    }

    public void postarVideo(){
        System.out.println("Você acabou de postar um vídeo no Instagram");
    }

    public void postarComentario(){
        System.out.println("Você acabou de comentar em um post no Instagram");
    }

    //--------------------------------------------------- CONSTRUTOR ---------------------------------------------------
    public Instagram(String senha, int numAmigos) throws CheckedException {
        super(senha, numAmigos);
    }

}
