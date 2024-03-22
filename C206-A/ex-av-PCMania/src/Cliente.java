public class Cliente {

    public String nome;
    public long cpf;
    Computador[] computadores = new Computador[10];
    public static float valorTotal;

    // Construtor
    Cliente(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    // Calcula o total da compra
    public float calculaTotalCompra(float valor){
        valorTotal += valor;
        return valorTotal;
    }

    // adiciona um objeto computador a um vetor computador
    public void addComputador(Computador computador){
        for(int i = 0; i < computadores.length; i++){
            if(computadores[i] == null){
                computadores[i] = computador;
                break;
            }
        }
    }

    // Nota fiscal da compra - mostra os dados do cliente e dos produtos comprados
    public void mostraInfo(){
        System.out.println("------------- COMPRA FINALIZADA -------------");
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("------------------ PRODUTOS -----------------");
        for(Computador computador : computadores){
            if(computador != null)
                computador.mostraPCConfigs();
        }
        System.out.println("---------------------------------------------");
        System.out.println("Valor total: " + valorTotal);
    }

}
