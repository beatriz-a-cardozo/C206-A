public class BracoArticulado extends Robo{

    private int numeroDeArticulacoes;
    private Garra garra = new Garra();

    private Camera camera = new Camera();

    public void trabalhar(){
        if(camera != null){
            int res = camera.acharPeca();

            if(res >= 0)
                garra.agarrarPeca(res);
            else
                garra.agarrarPeca();
        }

        super.setEnergia(super.getEnergia() - 5);
    }

    public BracoArticulado(int energia, String nome, int energiaMaxima, int numeroDeArticulacoes, Garra garra, Camera camera) {
        super(energia, nome, energiaMaxima);
        this.numeroDeArticulacoes = numeroDeArticulacoes;
        this.garra = garra;
        this.camera = camera;
    }

    public int getNumeroDeArticulacoes() {
        return numeroDeArticulacoes;
    }

    public void setNumeroDeArticulacoes(int numeroDeArticulacoes) {
        this.numeroDeArticulacoes = numeroDeArticulacoes;
    }
}
