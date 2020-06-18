package Classes;

import java.util.ArrayList;

public class Repositorio {

    private ArrayList<Utilizador> utilizadores = new ArrayList<Utilizador>();
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    private ArrayList<Encomenda> encomendas = new ArrayList<Encomenda>();
    private ArrayList<Estado> estados = new ArrayList<Estado>();
    private ArrayList<Feedback> feedbacks = new ArrayList<Feedback>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    private ArrayList<RequesicaoEncomeda> requesicaoEncomedas = new ArrayList<RequesicaoEncomeda>();
    private ArrayList<SendEmail> sendEmails = new ArrayList<SendEmail>();
    private ArrayList<TipoPagamento> tipoPagamentos = new ArrayList<TipoPagamento>();
    private ArrayList<Transportadora> transportadoras = new ArrayList<Transportadora>();
    private ArrayList<Voucher> vouchers = new ArrayList<Voucher>();
    private ArrayList<entradaNovaEncomeda> entradaNovaEncomedas = new ArrayList<entradaNovaEncomeda>();

    void adicionaUtilizador(Utilizador utilizador){
        utilizadores.add(utilizador);
    }

    void adicionaLivro(Livro livro){
        livros.add(livro);
    }

    void adicionaEncomenda(Encomenda encomenda){
        encomendas.add(encomenda);
    }

    void adicionaEstado(Estado estado){
        estados.add(estado);
    }

    void adicionaFeedback(Feedback feedback){
        feedbacks.add(feedback);
    }

    void adicionaFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    void adicionaPagamento(Pagamento pagamento){
        pagamentos.add(pagamento);
    }

    void adicionaRequesicaoEncomenda(RequesicaoEncomeda requesicaoEncomeda){
        requesicaoEncomedas.add(requesicaoEncomeda);
    }

    void adicionaSendEmail(SendEmail sendEmail){
        sendEmails.add(sendEmail);
    }

    void adicionaTipoPagamento(TipoPagamento tipoPagamento){
        tipoPagamentos.add(tipoPagamento);
    }

    void adicionaTransportador(Transportadora transportadora){
        transportadoras.add(transportadora);
    }

    void adicionaVoucher(Voucher voucher){
        vouchers.add(voucher);
    }

    void adicionaEntradaNovaEncomenda(entradaNovaEncomeda entradaNovaEncomeda){
        entradaNovaEncomedas.add(entradaNovaEncomeda);
    }
}
