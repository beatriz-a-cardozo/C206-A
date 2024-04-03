import java.util.Scanner;
// ALT + Insert -> geradores automáticos

// --------------- ENCAPSULAMENTO ------------------
public class Main {
    public static void main(String[] args) {
        // calcular a área da circuferência
        System.out.println(Calculadora.circuferencia(1.9));;
        // calcular o volume da esfera
        System.out.println(Calculadora.volumeEsfera(1.45));
        //calcular volume do cilindro
        System.out.println(Calculadora.volumeCilindro(0.95, 5.0));
    }
}
