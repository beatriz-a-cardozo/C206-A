
public class Cantina {
    public String nome;
    Salgado[] salgados = new Salgado[20];

    public void addSalgado(Salgado novoSalgado){
        for(int i = 0; i < salgados.length; i++) {
            if(salgados[i] == null) {
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("A Cantina " + this.nome + " possui os seguintes salgados: ");
        for(Salgado salgado : salgados) { // for (tipo elemento : coleção) - percorre elementos de uma coleção
            if (salgado != null) // verifica se existe o salgado antes de imprimir
                System.out.println(salgado.nome);
        }
    }
}
