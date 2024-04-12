public class Garra {

    private int pressao;

    public void agarrarPeca(){
        System.out.println("Agarrando peça padrão.");
    }

    public void agarrarPeca(int posicao){
        System.out.println("Agarrando peça na posição " + posicao);
    }


    public Garra(int pressao) {
        this.pressao = pressao;
    }

    public Garra(){

    }

    public int getPressao() {
        return pressao;
    }

    public void setPressao(int pressao) {
        this.pressao = pressao;
    }
}
