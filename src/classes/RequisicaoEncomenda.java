package classes;

import java.time.LocalDate;

public class RequisicaoEncomenda {

    private LocalDate data;
    private Livro livro;
    private int qt;
    private Utilizador cliente;
    private String morada;
    private Voucher voucher;
    private Pagamento pagamento;
    private boolean validacao;

    public RequisicaoEncomenda(LocalDate data, Livro livro, int qt, Utilizador cliente, String morada, Voucher voucher, Pagamento pagamento, boolean validacao) {
        this.data = data;
        this.livro = livro;
        this.qt = qt;
        this.cliente = cliente;
        this.morada = morada;
        this.voucher = voucher;
        this.pagamento = pagamento;
        this.validacao = validacao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }

    public Utilizador getCliente() {
        return cliente;
    }

    public void setCliente(Utilizador cliente) {
        this.cliente = cliente;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public boolean isValidacao() {
        return validacao;
    }

    public void setValidacao(boolean validacao) {
        this.validacao = validacao;
    }

    @Override
    public String toString() {
        return "<" +
                " Data= " + this.getData() +
                " Cliente= " + this.getCliente() +
                " Livro= " + this.getLivro() +
                " Quantidade= " + this.getQt() +
                " Morada= " + this.getMorada() +
                " Voucher = " + this.getVoucher() +
                " Pagamento = " + this.getPagamento()
                + " >"
                ;
    }
}
