import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //------------------------------------------- declaração de variável -------------------------------------------
        Monstro bruxo = new Bruxa(78, 100, 25);
        Monstro vampiro = new Vampiro(347, 75, 40, 50, false);
        Monstro zumbi = new Zumbi(18, 100, 50, 2);

        int opPersonagem;
        int opAcao;
        int flag = 1;
        String alvo;

        Scanner entrada = new Scanner(System.in);

        //------------------------------------------- criando novos feitiços -------------------------------------------
        Feitico feitico1 = new Feitico("Stupefasa", 6);
        Feitico feitico2 = new Feitico("Expelliarmus", 12);
        Feitico feitico3 = new Feitico("Avada Kedrava", 20);
        Feitico feitico4 = new Feitico("Imperio", 16);
        Feitico feitico5 = new Feitico("Crucio", 18);
        Feitico feitico6 = new Feitico("Bombarda", 10);
        Feitico feitico7 = new Feitico("Accio", 5);
        Feitico feitico8 = new Feitico("Sectumsempra", 14);
        Feitico feitico9 = new Feitico("Riddikulus", 2);
        Feitico feitico10 = new Feitico("Epinskey", 5);

        ((Bruxa) bruxo).addFeitico(feitico1);
        ((Bruxa) bruxo).addFeitico(feitico2);
        ((Bruxa) bruxo).addFeitico(feitico3);
        ((Bruxa) bruxo).addFeitico(feitico4);
        ((Bruxa) bruxo).addFeitico(feitico5);
        ((Bruxa) bruxo).addFeitico(feitico6);
        ((Bruxa) bruxo).addFeitico(feitico7);
        ((Bruxa) bruxo).addFeitico(feitico8);
        ((Bruxa) bruxo).addFeitico(feitico9);
        ((Bruxa) bruxo).addFeitico(feitico10);


        System.out.println("Para comecar, escolha seu personagem: ");
        System.out.println();
        System.out.println("1 -------------------------------------");
        bruxo.mostraInfo();
        System.out.println();
        System.out.println("2 -------------------------------------");
        vampiro.mostraInfo();
        System.out.println(3);
        System.out.println("3 -------------------------------------");
        zumbi.mostraInfo();

        opPersonagem = entrada.nextInt();

        switch(opPersonagem){
            case 1:
                do {
                    System.out.println("VOCE ESCOLHEU: BRUXA!");
                    System.out.println("Voce pode escolher:");
                    System.out.println("1 -------------------------------------");
                    System.out.println("Assustar outro monstro.");
                    System.out.println("2 -------------------------------------");
                    System.out.println("Aprender um feitico novo.");
                    System.out.println("3 -------------------------------------");
                    System.out.println("Listar todos os feiticos que voce sabe.");
                    System.out.println("4 -------------------------------------");
                    System.out.println("Esquecer um feitico para limpar seu inventario.");
                    System.out.println("5 -------------------------------------");
                    System.out.println("Lancar um feitico contra um inimigo.");
                    System.out.println("6 -------------------------------------");
                    System.out.println("Mostra os dados dos personagens atualmente.");

                    opAcao = entrada.nextInt();

                    switch (opAcao) {
                        case 1:
                            System.out.println("Entre com o monstro alvo. vampiro ou zumbi");

                            alvo = entrada.next();

                            if (alvo.equalsIgnoreCase("zumbi"))
                                bruxo.assustar(zumbi);

                            else if (alvo.equalsIgnoreCase("vampiro"))
                                bruxo.assustar(vampiro);

                            else
                                System.out.println("opcao invalida.");

                            break;

                        case 2:
                            System.out.println("Entre com o nome do feitico e seu nivel de poder.");

                            ((Bruxa) bruxo).aprenderFeitico(entrada.next(), entrada.nextInt());
                            break;

                        case 3:
                            ((Bruxa) bruxo).listarFeiticos();

                            break;

                        case 4:
                            System.out.println("Entre com a posicao do feitico que deseja esquecer (De 0 a 20).");

                            ((Bruxa) bruxo).esquecerFeitico(entrada.nextInt());

                            break;

                        case 5:
                            System.out.println("Entre com o seu alvo.");

                            alvo = entrada.next();

                            if (alvo.equalsIgnoreCase("zumbi")) {
                                System.out.println("Entre com a posicao do feitico que deseja usar(de 0 a 20).");

                                ((Bruxa) bruxo).lancarFeitico(zumbi, entrada.nextInt());
                            } else if (alvo.equalsIgnoreCase("vampiro")) {
                                System.out.println("Entre com a posicao do feitico que deseja usar(de 0 a 20).");

                                ((Bruxa) bruxo).lancarFeitico(vampiro, entrada.nextInt());
                            } else
                                System.out.println("opcao invalida.");

                            break;

                        case 6:
                            bruxo.mostraInfo();
                            vampiro.mostraInfo();
                            zumbi.mostraInfo();

                            break;

                        default:
                            System.out.println("opcao invalida.");

                            break;
                    }

                    System.out.println("Se deseja encerrar o jogo, digite 0, se quer continuar, digite 1");

                    flag = entrada.nextInt();

                }while(flag != 0);
                break;

            case 2:
                do {
                    System.out.println("VOCE ESCOLHEU: VAMPIRO");
                    System.out.println("Voce pode escolher:");
                    System.out.println("1 -------------------------------------");
                    System.out.println("Mudar de forma.");
                    System.out.println("2 -------------------------------------");
                    System.out.println("Atacar com mordida outro monstro. Se conseguir um bom ataque, podera recuperar vida.");
                    System.out.println("3 -------------------------------------");
                    System.out.println("Monstrar as informacoes atuais dos personagens.");

                    opAcao = entrada.nextInt();

                    switch (opAcao) {
                        case 1:
                            System.out.println("Mudando de forma...");

                            ((Vampiro) vampiro).transformar();

                            break;

                        case 2:
                            System.out.println("Entre com o mosntro alvo.");

                            alvo = entrada.next();

                            if (alvo.equalsIgnoreCase("zumbi"))
                                ((Vampiro) vampiro).atacarComMordida(zumbi);

                            else if (alvo.equalsIgnoreCase("bruxa"))
                                ((Vampiro) vampiro).atacarComMordida(bruxo);

                            else
                                System.out.println("opcao invalida.");

                            break;

                        case 3:
                            bruxo.mostraInfo();
                            vampiro.mostraInfo();
                            zumbi.mostraInfo();

                            break;

                        default:
                            System.out.println("opcao invalida.");

                            break;
                    }

                    System.out.println("Se deseja encerrar o jogo, digite 0, se quer continuar, digite 1");

                    flag = entrada.nextInt();

                }while(flag != 0);
                break;

            case 3:
                do {
                    System.out.println("VOCE ESCOLHEU: ZUMBI");
                    System.out.println("Voce pode escolher:");
                    System.out.println("1 -------------------------------------");
                    System.out.println("Atacar com mordida outro monstro. Se conseguir um bom ataque, ganhara um novo cerebro.");
                    System.out.println("2 -------------------------------------");
                    System.out.println("Monstrar as informacoes atuais dos personagens.");

                    opAcao = entrada.nextInt();

                    switch (opAcao) {
                        case 1:
                            System.out.println("Entre com o mosntro alvo.");

                            alvo = entrada.next();

                            if (alvo.equalsIgnoreCase("vampiro"))
                                ((Zumbi) zumbi).atacarComMordida(vampiro);

                            else if (alvo.equalsIgnoreCase("bruxa"))
                                ((Zumbi) zumbi).atacarComMordida(bruxo);

                            else
                                System.out.println("opcao invalida.");

                            break;

                        case 2:
                            bruxo.mostraInfo();
                            vampiro.mostraInfo();
                            zumbi.mostraInfo();

                            break;

                        default:
                            System.out.println("opcao invalida.");

                            break;
                    }

                    System.out.println("Se deseja encerrar o jogo, digite 0, se quer continuar, digite 1");

                    flag = entrada.nextInt();

                }while(flag != 0);
                break;

            default:
                System.out.println("opcao invalida");
                break;
        }
    }
}
