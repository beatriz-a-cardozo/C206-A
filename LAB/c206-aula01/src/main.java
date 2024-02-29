// identifica como a classe - main
public class main {
    // função main
    public static void main(String[] args) {
        // chama a função fatorial e mostra seu resultado
        System.out.println(fatorial(5));
        // chama a função mostraPares
        mostraPares(23);
    }
    // função que cácula o fatorial de um inteiro
    public static int fatorial (int n) {
        if(n==1) {
            return 1;
        }
        else {
            return n * fatorial(n-1);
        }
    }
    // função que identifica o números pares entre 0 e um inteiro
    public static void mostraPares(int n) {

        while(n>0) {
            if (n%2 == 0) {
                System.out.println(n);
            }
            n--;
        }
}
}

