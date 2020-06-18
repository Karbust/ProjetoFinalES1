public class TipoPagamento {

    private boolean multibanco;
    private boolean mbway;
    private boolean transfarencia;
    private boolean paypal;

    public TipoPagamento(boolean multibanco, boolean mbway, boolean transfarencia, boolean paypal) {
        this.multibanco = multibanco;
        this.mbway = mbway;
        this.transfarencia = transfarencia;
        this.paypal = paypal;
    }

    public boolean isMultibanco() {
        return multibanco;
    }

    public void setMultibanco(boolean multibanco) {
        this.multibanco = multibanco;
    }

    public boolean isMbway() {
        return mbway;
    }

    public void setMbway(boolean mbway) {
        this.mbway = mbway;
    }

    public boolean isTransfarencia() {
        return transfarencia;
    }

    public void setTransfarencia(boolean transfarencia) {
        this.transfarencia = transfarencia;
    }

    public boolean isPaypal() {
        return paypal;
    }

    public void setPaypal(boolean paypal) {
        this.paypal = paypal;
    }
}
