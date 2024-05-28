package exPratico;

import excecoes.CheckedException;
import excecoes.Unchecked;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        try{
            // criação das redes sociais do usuário
            RedeSocial[] redesSociais= {
                    new Instagram("instagram12", 339),
                    new Facebook("facebook16", 339)
            };

            // criação do usuário
            Usuario usuario = new Usuario("Beatriz Cardozo", "beatriz.cardozo@ges.inatel.br", redesSociais);

            // ações do inatagram
            for (RedeSocial rede : redesSociais) {
                if (rede instanceof Instagram) {
                    Instagram instagram = (Instagram) rede;
                    instagram.postarFoto();
                    instagram.postarComentario();
                    instagram.postarVideo();
                }
            }

            // ações do facebook
            for (RedeSocial rede : redesSociais) {
                if (rede instanceof Facebook) {
                    Facebook facebook = (Facebook) rede;
                    facebook.postarFoto();
                    facebook.postarComentario();
                    facebook.fazStreaming();
                    facebook.compartilhar();
                }
            }

        }
        catch(Unchecked erro){
            System.out.println("Erro desconhecido: " + erro.getMessage());
        }
        catch(CheckedException erro){
            System.out.println(erro.getMessage());
        }



    }
}
