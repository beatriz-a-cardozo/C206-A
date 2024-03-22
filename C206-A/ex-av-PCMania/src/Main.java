import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Beatriz Cardozo", 123456789);

        // criando os hardwares basicos - core
        HardwareBasico core3 = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico core5 = new HardwareBasico("Pentium Core i5", 3370);
        HardwareBasico core7 = new HardwareBasico("Pentium Core i7", 4500);
        // criando os hardwares básicos - memoria ram
        HardwareBasico ram8 = new HardwareBasico("Memoria Ram", 8);
        HardwareBasico ram16 = new HardwareBasico("Memoria Ram", 16);
        HardwareBasico ram32 = new HardwareBasico("Memoria Ram", 32);
        // criando os hardwares básicos - hd
        HardwareBasico hd5gb = new HardwareBasico("Gb de HD", 500);
        HardwareBasico hd1tb = new HardwareBasico("Tb de HD", 1);
        HardwareBasico hd2tb = new HardwareBasico("Tb de HD", 2);

        // criando as memorias USB que acompanham o PC
        MemoriaUSB pd16 = new MemoriaUSB("Pen-Drive", 16);
        MemoriaUSB pd32 = new MemoriaUSB("Pen-Drive", 32);
        MemoriaUSB hdtb = new MemoriaUSB("HD Externo", 1);

        // ----------------------------- Associando os dados a PROMOÇÃO 1 - computador 1 -----------------------------
        Computador comp1 = new Computador("Positivo", 3300, new SistemaOperacional("Linux Ubuntu", 32));
        comp1.addHardware(core3);
        comp1.addHardware(ram8);
        comp1.addHardware(hd5gb);
        comp1.addMemoriaUSB(pd16);

        // ----------------------------- Associando os dados a PROMOÇÃO 2 - computador 2 -----------------------------
        Computador comp2 = new Computador("Acer", 8800, new SistemaOperacional("Windows 8", 64));
        comp2.addHardware(core5);
        comp2.addHardware(ram16);
        comp2.addHardware(hd1tb);
        comp2.addMemoriaUSB(pd32);

        // ----------------------------- Associando os dados a PROMOÇÃO 3 - computador 3 -----------------------------
        Computador comp3 = new Computador("Vaio", 4800, new SistemaOperacional("Windows 10", 64));
        comp3.addHardware(core7);
        comp3.addHardware(ram32);
        comp3.addHardware(hd2tb);
        comp3.addMemoriaUSB(hdtb);

        // Declaração de variaveis auxiliares
        int produto;
        int[] produtoAdq = new int[2];

        Scanner entrada = new Scanner(System.in); // declara a função de entrada

        // -------- MOSTRANDO INFORAMÇÕES DOS COMPUTADORES ---------
        // -------------- PROMOÇÃO 1 - COMPUTADOR 1 ----------------
        comp1.mostraPCConfigs();
        // -------------- PROMOÇÃO 2 - COMPUTADOR 2 ----------------
        comp2.mostraPCConfigs();
        // -------------- PROMOÇÃO 3 - COMPUTADOR 3 ----------------
        comp3.mostraPCConfigs();

        // ------------- Entra na página de compras ----------------
        System.out.println("Não perca essa promoção! Garanta já seu novo " +
                "PC de alta qualidade por um preço acessível!");
        do{
            System.out.println("Qual PC voce deseja comprar? Para finalizar sua compra digite 0.");
            produto = entrada.nextInt();

            switch(produto){
                case 1:
                    cliente.calculaTotalCompra(comp1.preco);
                    cliente.addComputador(comp1);
                    break;

                case 2:
                    cliente.calculaTotalCompra(comp2.preco);
                    cliente.addComputador(comp2);
                    break;

                case 3:
                    cliente.calculaTotalCompra(comp3.preco);
                    cliente.addComputador(comp3);
                    break;

                default:
                    break;
            }

        }while(produto != 0);

        cliente.mostraInfo(); // Mostra os dados do cliente e dos computadores comprados

    }
}
