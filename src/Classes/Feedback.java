package classes;

public class Feedback {

    private int avaliacao;
    private String obs;


    public Feedback(int avaliacao, String obs) {
        this.avaliacao = avaliacao;
        this.obs = obs;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
