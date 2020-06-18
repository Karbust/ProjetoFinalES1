package Classes;

public class Encomenda {

    private int nEnc;
    private RequesicaoEncomeda requesicao;
    private Funcionario funcionario;
    private Estado estado;
    private Transportadora transportadora;
    private Feedback feedback;

    public Encomenda(int nEnc, RequesicaoEncomeda requesicao, Funcionario funcionario, Estado estado, Transportadora transportadora, Feedback feedback) {
        this.nEnc = nEnc;
        this.requesicao = requesicao;
        this.funcionario = funcionario;
        this.estado = estado;
        this.transportadora = transportadora;
        this.feedback = feedback;
    }

    public int getnEnc() {
        return nEnc;
    }

    public void setnEnc(int nEnc) {
        this.nEnc = nEnc;
    }

    public RequesicaoEncomeda getRequesicao() {
        return requesicao;
    }

    public void setRequesicao(RequesicaoEncomeda requesicao) {
        this.requesicao = requesicao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }
}
