/* o nome da 'public class' tem que ser o mesmo nome do arquivo */
public class Main {
    /* args = argumento */
    /* função principal do codigo, essa é a função 'int main' do código */
    public static void main(String[] args) {
        System.out.println("Hello Java!");

        /* Atalho "cout 'tab'*/
        System.out.println("Hello World!");

        /* Declaração de Variáveis */
        int x = 10;
        int y = 20;

        System.out.println(x+y);
        /* tem que ter parenteses na soma direta no exemplo abaixo, se não ele apenas mostra x e y */
        System.out.println("A soma de x e y é: " + (x + y));
    }
}