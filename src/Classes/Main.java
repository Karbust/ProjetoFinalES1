package classes;

import java.time.LocalDate;

public class Main {
    public static void main(String args[]) {
        Utilizador u = new Utilizador("Joaquim", "joaquim@gmail.com", "joaquim123");
        RequesicaoEncomeda requesicaoEncomeda = new RequesicaoEncomeda(LocalDate.now(), new Livro("Quim Barreiros:Uma vida", 12345, true), 1, u, "Rua do Pimba", new Voucher(1232532, true), new Pagamento(20), true);
        Encomenda encomenda = new Encomenda(1, requesicaoEncomeda, new Funcionario("zezinho", 1), new Estado(false, true, false), new Transportadora("VrummVrumm", "vrummvrumm@geral.pt", "Avenida dos Arranques", false), new Feedback(0, null));
        EntradaNovaEncomeda NEncomenda=new EntradaNovaEncomeda(LocalDate.now(),encomenda);
        Repositorio repo = new Repositorio();
        repo.adicionaEntradaNovaEncomenda(NEncomenda);
        System.out.println(NEncomenda.getEncomenda().getRequesicao().getLivro().getNome());
    }
}
