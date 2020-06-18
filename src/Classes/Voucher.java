package classes;

public class Voucher {

    private int voucher;
    private boolean validacao;

    public Voucher(int voucher, boolean validacao) {
        this.voucher = voucher;
        this.validacao = validacao;
    }

    public int getVoucher() {
        return voucher;
    }

    public void setVoucher(int voucher) {
        this.voucher = voucher;
    }

    public boolean isValidacao() {
        return validacao;
    }

    public void setValidacao(boolean validacao) {
        this.validacao = validacao;
    }
}
