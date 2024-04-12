import java.util.Random;
public class Camera {

    private int qualidade;

    Random random = new Random();

    public int acharPeca(){
        if(qualidade > 5)
            return random.nextInt(10);
        else
            return -1;
    }

    public Camera(int qualidade) {
        this.qualidade = qualidade;
    }

    public Camera(){

    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }
}
