public class Cliente {

    private String nome;
    private String cpf;

    private Conta conta;

    // -------------------------------------------- CONSTRUTOR --------------------------------------------
    Cliente(String nome, String cpf, Conta conta){
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    Cliente(){

    }

    // -------------------------------------------- GETTERS & SETTERS --------------------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    //  -------------------------------------------- METODOS --------------------------------------------
    public boolean sacarDinheiro(double valor){
        if(valor <= this.conta.getSaldo()){
            this.conta.setSaldo(this.conta.getSaldo()-valor);

            return true;
        }
        else
            return false;
    }

    public void depositarDinheiro(double valor){
        conta.setSaldo(conta.getSaldo()+valor);
    }

    public boolean comprarComCredito(double valor){
        if(valor <= this.conta.getLimite()){
            this.conta.setLimite(this.conta.getLimite() - valor);

            return true;
        }
        else
            return false;
    }

    public boolean transferir(Conta contaParaReceber, double valor){
        if(valor <= this.conta.getSaldo()){
            this.conta.setSaldo(this.conta.getLimite() - valor);
            contaParaReceber.setSaldo(this.conta.getSaldo() + valor);

            return true;
        }
        else
            return false;
    }

    public String toString(){
        return "Cliente{ " +
                "nome: " + nome +
                " cpf: " + cpf +
                " dados da conta {" +
                " saldo= " + conta.getSaldo() +
                " limite= " + conta.getLimite() +
                "} }";
    }
}
