import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // --------------------------- declaração das variáveis --------------------------
        Nave waverider = new Nave("Waverider", 10,"Normal");
        Nave gideon = new Nave("Gideon", 4, "Explosivo");
        Asteroide[] asteroides = new Asteroide[8];

        String naveUsada;
        String asteroideAlvo;
        int numJogadas = 10;
        int aux = 0;
        boolean win = false;

        Scanner in = new Scanner(System.in); // Scanner para a entrada de dados

        asteroides[0] = new Asteroide("Jupiter", "Grande");
        asteroides[1] = new Asteroide("Netuno", "Grande");
        asteroides[2] = new Asteroide("Minerva", "Grande");
        asteroides[3] = new Asteroide("Marte", "Pequeno");
        asteroides[4] = new Asteroide("Diana", "Pequeno");
        asteroides[5] = new Asteroide("Febo", "Pequeno");
        asteroides[6] = new Asteroide("Baco", "Pequeno");
        asteroides[7] = new Asteroide("Venus", "Pequeno");

        // -------------------------- regras do jogo --------------------------
        System.out.println("Você tem 10 chances para destruir todos os asteroides.");
        System.out.println("Há 3 asteroides grandes entre os 8, que só são destruidos por tiros explosivos.");
        System.out.println("Você é o comandante de duas naves. Waverider para tiros normais, e Gideon " +
                "é sua nave de batalha, com tiros explosivos.");

        // ----------------------------- design --------------------------------
        System.out.println(" _____________________________________");
        System.out.println("        |Baco|    ");
        System.out.println("      |Marte| |Jupiter|      |Minerva|");
        System.out.println("                     |Diana|");
        System.out.println("    |Febo|       |Netuno|");
        System.out.println("                           |Venus|");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("             \uD81A\uDD3C        \uD81A\uDD3C");
        System.out.println(" _____________________________________");

        // ------------------------------- jogada --------------------------------------
        do {
            // --------------------- saída e entrada de dados -------------------------
            System.out.println("----------------- JOGADAS RESTANTES: " + numJogadas + " -----------------" );
            System.out.println("Qual dos asteroides você deseja atirar? ");
            asteroideAlvo = in.next();
            System.out.println("Qual nave deseja usar? Waverider ou Gideon? ");
            naveUsada = in.next();

            for(int i = 0; i < 8; i++) {

                if(asteroideAlvo.equalsIgnoreCase(asteroides[i].getNome())) {

                    if(!asteroides[i].getNome().equals("destruido")) {

                        if(naveUsada.equalsIgnoreCase(waverider.getNome())) {
                            waverider.atirar(asteroides[i]);

                            numJogadas--;
                        }

                        else if(naveUsada.equalsIgnoreCase(gideon.getNome())) {
                            gideon.atirar(asteroides[i]);

                            numJogadas--;
                        }

                        else
                            System.out.println("Nome da nave inválida.");

                    }

                    else
                        System.out.println(asteroides[i].getNome() + " já foi destruido");

                }
            }

            // ---------------------- verica se o jogo já foi ganho ----------------------
            aux = 0;

            for(int j = 0; j < 8; j++) {
                if(asteroides[j].getNome().equals("destruido"))
                    aux++;
            }

            System.out.println(aux);
            if (aux == 8)
                win = true;

        } while(numJogadas > 0 && !win);

        if(aux == 8) {
            System.out.println(" --------------------");
            System.out.println("|       YOU WIN      |");
            System.out.println(" --------------------");
        }

        else {
            System.out.println(" ---------------------");
            System.out.println("|      GAME OVER       |");
            System.out.println(" ---------------------");
        }
    }
}