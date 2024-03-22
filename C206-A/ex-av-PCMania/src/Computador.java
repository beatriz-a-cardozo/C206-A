public class Computador {

    public String marca;
    public float preco;

    public MemoriaUSB[] memorias = new MemoriaUSB[1];
    public SistemaOperacional sistema;
    public HardwareBasico[] hardwares = new HardwareBasico[10];

    // mostra os dados do computador
    public void mostraPCConfigs(){

        System.out.println("PC {");
        System.out.println("     Marca: " +  marca);
        System.out.println("     Preço: R$" + preco);
        System.out.println("     Hardware{");
        for(HardwareBasico hardware: hardwares){
            if(hardware != null)
                System.out.println("          " + hardware.nome + " " + hardware.capacidade);
        }
        System.out.println("     }");
        System.out.println("     Sistema{");
        System.out.println("          " + sistema.nome + " (" + sistema.tipo + " bits)");
        System.out.println("     }");
        for(MemoriaUSB memoria : memorias){
            if(memoria != null)
                System.out.println("     Acompanha : " + memoria.nome + " " + memoria.capacidade);
        }
        System.out.println("}");

    }

    // construtor
    Computador(String marca, float preco, SistemaOperacional sistema){
        this.marca = marca;
        this.preco = preco;
        this.sistema = sistema;
    }

    // adiciona um objeto memoria ao vetor memoria
    public void addMemoriaUSB(MemoriaUSB musb){
        for(int i = 0; i < memorias.length; i++){
            if(memorias[i] == null){
                memorias[i] = musb;
                break;
            }
        }
    }

    // adiciona um objeto hardware ao vetor hardware
    public void addHardware(HardwareBasico hw){
        for(int i = 0; i < hardwares.length; i++){
            if(hardwares[i] == null){
                hardwares[i] = hw;
                break;
            }
        }
    }

}
