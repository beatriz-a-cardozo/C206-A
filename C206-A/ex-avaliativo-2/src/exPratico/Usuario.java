package exPratico;

import java.util.Collections;
import java.util.HashSet;
import excecoes.CheckedException;

public class Usuario {

    //-------------------------------------------- DECLARAÇÃO DE VARIÁVEIS ---------------------------------------------
    private String nome;
    private String email;
    public final HashSet<RedeSocial> redesSociais;

    // ------------------------------------------------- CONSTRUTORES --------------------------------------------------
    public Usuario(String nome, String email, RedeSocial[] redesSociais) {
        this.nome = nome;
        this.email = email;
        this.redesSociais =  new HashSet<RedeSocial>();
        Collections.addAll(this.redesSociais, redesSociais);
    }

    public Usuario(RedeSocial[] redesSociais){
        this.redesSociais =  new HashSet<RedeSocial>();
        Collections.addAll(this.redesSociais, redesSociais);
    }

}
