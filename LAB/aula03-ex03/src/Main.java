public class Main {
    public static void main(String[] args) {

        Cliente fefe = new Cliente();
        Cliente vini = new Cliente();

        Conta conta1 = new Conta(2.50, 200.00);
        Conta conta2 = new Conta(30, 0.00);

        fefe.setNome("Felipe Ferreira");
        fefe.setCpf("111.522.116-15");
        fefe.setConta(conta1);

        vini.setNome("Vinicius Carvalha");
        vini.setCpf("103.103.445-93");
        vini.setConta(conta2);

        System.out.println("vini e fefe pegaram um uber para casa juntos, " +
                "vini precisa passar um pix para o fefe agora, aqui esta os dados da conta do fefe e vini atualmente");
        System.out.println(fefe);
        System.out.println(vini);

        vini.transferir(conta2, 12.87);

        System.out.println("pix feito");

        System.out.println(vini);
        System.out.println(fefe);
    }
}
