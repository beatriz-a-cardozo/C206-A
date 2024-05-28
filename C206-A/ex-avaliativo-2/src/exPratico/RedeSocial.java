package exPratico;

import excecoes.CheckedException;
import excecoes.Unchecked;

public abstract class RedeSocial {

    //-------------------------------------------- DECLARAÇÃO DE VARIÁVEIS ---------------------------------------------
    protected String senha;
    protected int numAmigos;

    // ---------------------------------------------------- MÉTODOS ----------------------------------------------------
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();

    public void curtirPublicacao(){
        System.out.println("Publicação curtida.");
    }

    // -------------------------------------------------- CONSTRUTOR ---------------------------------------------------
    public RedeSocial(String senha, int numAmigos) throws CheckedException{
        if(numAmigos < 0)
            throw new Unchecked("Número inválido. Um usuário não pode ter um número negativo de amigos.");

        if(senha == null || senha.isEmpty())
            throw new CheckedException("Senha inválida. A senha deve conter pelo menos um caracter.");

        this.senha = senha;
        this.numAmigos = numAmigos;
    }

}
