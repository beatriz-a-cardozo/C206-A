public class Autor {

    private String nome;
    private Saga[] sagas = new Saga[20];

    // ------------- CONSTRUTOR -------------
    public Autor(String nome) {
        this.nome = nome;
    }

    // ------------- METODOS -------------
    public void listarSagas() {
        for(int i = 0; i < sagas.length; i++) {
            if(sagas[i] != null)
                System.out.println(sagas[i]);
        }
    }

    public void adicionarSaga(Saga saga) {
        for(int i = 0; i < sagas.length; i++){
            if(sagas[i] == null) {
                sagas[i] = saga;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println(this.nome + "{");
        listarSagas();
        System.out.println("}");
    }
}
