package classes;

public class Pagamento {

    private float valor;
    private TipoPagamento tipoPagamento;


    public Pagamento(float valor) {
        this.valor = valor;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
