package Classes;

public class Funcionario {

    private String nome;
    private int nFunc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnFunc() {
        return nFunc;
    }

    public void setnFunc(int nFunc) {
        this.nFunc = nFunc;
    }

    public Funcionario(String nome, int nFunc) {
        this.nome = nome;
        this.nFunc = nFunc;
    }
}
