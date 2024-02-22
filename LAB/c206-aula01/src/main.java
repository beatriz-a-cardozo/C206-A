public class main {
    public static void main(String[] args) {
        System.out.println(fatorial(5));

        mostraPares(23);
    }

    public static int fatorial (int n) {
        int res = n;

        while (n > 1) {
            res = res * (n-1);
            n--;
        }
        return n;
    }

    public static void mostraPares(int n) {

        while(n>0) {
            if (n/2 == 0) {
                System.out.println(n);
            }
            n--;
        }
}
}
