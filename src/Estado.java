public class Estado {

    private boolean processada;
    private boolean enviada;
    private boolean entregue;

    public Estado(boolean processada, boolean enviada, boolean entregue) {
        this.processada = processada;
        this.enviada = enviada;
        this.entregue = entregue;
    }

    public boolean isProcessada() {
        return processada;
    }

    public void setProcessada(boolean processada) {
        this.processada = processada;
    }

    public boolean isEnviada() {
        return enviada;
    }

    public void setEnviada(boolean enviada) {
        this.enviada = enviada;
    }

    public boolean isEntregue() {
        return entregue;
    }

    public void setEntregue(boolean entregue) {
        this.entregue = entregue;
    }
}
