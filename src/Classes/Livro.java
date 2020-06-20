package classes;

public class Livro {

    private String nome;
    private int ISBN;
    private boolean stock;


    public Livro(String nome, int isbn, boolean stock) {
        this.nome = nome;
        ISBN = isbn;
        this.stock = stock;
    }

    public String getNome() {
        return nome;
    }

    public int getISBN() {
        return ISBN;
    }

    public boolean isStock() {
        return stock;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        if(isStock()==true){
            return "<" +
                        " Nome= " + this.getNome() +
                        " ISBN= " + this.getISBN()
                        + " >"
                        ;
            }
        return "Livro nao esta em stock";
        }
}
