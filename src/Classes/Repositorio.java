package classes;

import java.util.ArrayList;

public class Repositorio {

    private ArrayList<Utilizador> utilizadores = new ArrayList<Utilizador>();
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    private ArrayList<Encomenda> encomendas = new ArrayList<Encomenda>();
    private ArrayList<Estado> estados = new ArrayList<Estado>();
    private ArrayList<Feedback> feedbacks = new ArrayList<Feedback>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    private ArrayList<RequisicaoEncomenda> requisicaoEncomendas = new ArrayList<RequisicaoEncomenda>();
    private ArrayList<SendEmail> sendEmails = new ArrayList<SendEmail>();
    private ArrayList<TipoPagamento> tipoPagamentos = new ArrayList<TipoPagamento>();
    private ArrayList<Transportadora> transportadoras = new ArrayList<Transportadora>();
    private ArrayList<Voucher> vouchers = new ArrayList<Voucher>();
    private ArrayList<EntradaNovaEncomenda> entradaNovaEncomendas = new ArrayList<EntradaNovaEncomenda>();

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

    void adicionaRequesicaoEncomenda(RequisicaoEncomenda requisicaoEncomenda){
        requisicaoEncomendas.add(requisicaoEncomenda);
    }

    void adicionaSendEmail(SendEmail sendEmail){
        sendEmails.add(sendEmail);
    }

    void adicionaTipoPagamento(TipoPagamento tipoPagamento){
        tipoPagamentos.add(tipoPagamento);
    }

    void adicionaTransportadora(Transportadora transportadora){
        transportadoras.add(transportadora);
    }

    void adicionaVoucher(Voucher voucher){
        vouchers.add(voucher);
    }

    void adicionaEntradaNovaEncomenda(EntradaNovaEncomenda entradaNovaEncomenda){
        entradaNovaEncomendas.add(entradaNovaEncomenda);
    }

    void save(Object c){
        if(c.getClass() == EntradaNovaEncomenda.class){
            adicionaEntradaNovaEncomenda((EntradaNovaEncomenda) c);
        }else if(c.getClass() == Encomenda.class){
            adicionaEncomenda((Encomenda) c);
        }else if(c.getClass() == Voucher.class){
            adicionaVoucher((Voucher) c);
        }else if(c.getClass() == Transportadora.class){
            adicionaTransportadora((Transportadora) c);
        }else if(c.getClass() == TipoPagamento.class){
            adicionaTipoPagamento((TipoPagamento) c);
        }else if(c.getClass() == SendEmail.class){
            adicionaSendEmail((SendEmail) c);
        }else if(c.getClass() == RequisicaoEncomenda.class){
            adicionaRequesicaoEncomenda((RequisicaoEncomenda) c);
        }else if(c.getClass() == Pagamento.class){
            adicionaPagamento((Pagamento) c);
        }else if(c.getClass() == Funcionario.class){
            adicionaFuncionario((Funcionario) c);
        }else if(c.getClass() == Feedback.class){
            adicionaFeedback((Feedback) c);
        }else if(c.getClass() == Estado.class){
            adicionaEstado((Estado) c);
        }else if(c.getClass() == Livro.class){
            adicionaLivro((Livro) c);
        }else if(c.getClass() == Utilizador.class) {
            adicionaUtilizador((Utilizador) c);
        }
    }

    void get(Object c){
        if(c.getClass() == EntradaNovaEncomenda.class){
            System.out.println(c.toString());
        }else if(c.getClass() == Encomenda.class){
            ((Encomenda) c).getnEnc();
            ((Encomenda) c).getEstado();
            ((Encomenda) c).getFuncionario();
            ((Encomenda) c).getTransportadora();
            ((Encomenda) c).getFeedback();
            ((Encomenda) c).getRequesicao();
        }else if(c.getClass() == Voucher.class){
            ((Voucher) c).getVoucher();
            ((Voucher) c).isValidacao();
        }else if(c.getClass() == Transportadora.class){
            ((Transportadora) c).getNome();
            ((Transportadora) c).getMorada();
            ((Transportadora) c).getContacto();
        }else if(c.getClass() == TipoPagamento.class){
            ((TipoPagamento) c).isMbway();
            ((TipoPagamento) c).isMultibanco();
            ((TipoPagamento) c).isPaypal();
            ((TipoPagamento) c).isTransfarencia();
        }else if(c.getClass() == SendEmail.class){
            ((SendEmail) c).getInfo();
            ((SendEmail) c).getMensagem();
        }else if(c.getClass() == RequisicaoEncomenda.class){
            ((RequisicaoEncomenda) c).getCliente();
            ((RequisicaoEncomenda) c).getLivro();
            ((RequisicaoEncomenda) c).getQt();
            ((RequisicaoEncomenda) c).getMorada();
            ((RequisicaoEncomenda) c).getVoucher();
            ((RequisicaoEncomenda) c).getData();
            ((RequisicaoEncomenda) c).getPagamento();
        }else if(c.getClass() == Pagamento.class){
            ((Pagamento) c).getTipoPagamento();
            ((Pagamento) c).getValor();
        }else if(c.getClass() == Funcionario.class){
            ((Funcionario) c).getNome();
            ((Funcionario) c).getnFunc();
        }else if(c.getClass() == Feedback.class){
            ((Feedback) c).getAvaliacao();
            ((Feedback) c).getObs();
        }else if(c.getClass() == Estado.class){
            ((Estado) c).isEntregue();
            ((Estado) c).isEnviada();
            ((Estado) c).isProcessada();
        }else if(c.getClass() == Livro.class){
            ((Livro) c).getNome();
            ((Livro) c).getISBN();
            ((Livro) c).isStock();
        }else if(c.getClass() == Utilizador.class) {
            ((Utilizador) c).getNome();
            ((Utilizador) c).getEmail();
            ((Utilizador) c).getPassword();
        }
    }

}
