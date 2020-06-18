package Classes;

import java.time.LocalDate;

public class entradaNovaEncomeda {

    LocalDate data;
    Encomenda encomenda;

    public entradaNovaEncomeda(LocalDate data, Encomenda encomenda) {
        this.data = data;
        this.encomenda = encomenda;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
    }
}
