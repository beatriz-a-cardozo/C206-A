import java.util.ArrayList;
import java.util.Random;

public class Cozinheiro extends Pirata {

    private ArrayList<Receita> livroDeReceitas;
    Random random = new Random();

    public String prepararPrato(int index){

        if(livroDeReceitas.get(index) != null) {
            if (super.getPoder() >= livroDeReceitas.get(index).getDificuldade()) {
                System.out.println("Comida está sendo preparada, aguarde um instante...");
                return livroDeReceitas.get(index).getNome();
            } else {
                System.out.println("Não é possível preparar essa receita, pois o cozinheiro não é bom o suficiente.");
                System.out.println("Ele vai preparar outra comida.");
                return prepararPrato(random.nextInt(10));
            }
        }
        else
            return prepararPrato(random.nextInt(10));
    }

    public void mostrarReceitas(){

        for(int i = 0; i < livroDeReceitas.size(); i++){

            if(livroDeReceitas.get(i) != null){

                System.out.println("----------------------------------- " + i);
                System.out.println(livroDeReceitas.get(i).getNome());
                System.out.println("Dificuldade: " + livroDeReceitas.get(i).getDificuldade());

            }

        }

    }

    public Cozinheiro(String nome, String comidaFavorita, int poder, ArrayList livroDeReceitas){

        super(nome, comidaFavorita, poder);
        livroDeReceitas = new ArrayList();

    }

    @Override
    public String toString() {
        return "Cozinheiro{" + '\'' +
                super.toString() + '\'' +
                "}";
    }
}
