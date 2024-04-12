public class Main {

    public static void main(String[] args) {
        Robo braco = new BracoArticulado(100, "Gideon", 100, +
                4, new Garra(15), new Camera(8));
        Robo braco2 = new BracoArticulado(100, "Simon", 100, +
                4, new Garra(20), new Camera(4));

        Robo empil = new Empilhador(90, "Drako", 90, 40, null);
        Robo empil2 = new Empilhador(75, "Folder", 75, 80, null);

        System.out.println("testando o peso maximo do empilhador 1");
        ((Empilhador) empil).adicionaPacote(2);
        ((Empilhador) empil).adicionaPacote(8);
        ((Empilhador) empil).adicionaPacote(32);

        System.out.println("monstra pacotes antes da remoção");
        ((Empilhador) empil).mostraPacotes();

        ((Empilhador) empil).removePacote(0);

        System.out.println("monstra pacotes depois da remoção");
        ((Empilhador) empil).mostraPacotes();

        System.out.println("testando o peso maximo do empilhador 2");
        ((Empilhador) empil2).adicionaPacote(2);
        ((Empilhador) empil2).adicionaPacote(8);
        ((Empilhador) empil2).adicionaPacote(32);
        ((Empilhador) empil2).adicionaPacote(20);
        ((Empilhador) empil2).adicionaPacote(40);

        System.out.println("testando a energia maxima");
        empil.trabalhar();
        empil.trabalhar();
        empil.trabalhar();
        empil.trabalhar();

        System.out.println("testando a função recarregar");
        empil.recarregar(4);

        empil.trabalhar();

        System.out.println("testando energia maxima do braço articulado e suas funções");
        ((BracoArticulado) braco).trabalhar();
        ((BracoArticulado) braco).trabalhar();
        ((BracoArticulado) braco).trabalhar();
        ((BracoArticulado) braco).trabalhar();

        System.out.println("testando a camera de menor qualidade");
        ((BracoArticulado) braco2).trabalhar();

        System.out.println("testando trocar energia");
        empil.trocarEnergia(braco2);

        System.out.println("total de robos:" +  empil.getTotalDeRobos());

    }

}
