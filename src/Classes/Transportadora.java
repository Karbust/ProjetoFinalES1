package classes;

public class Transportadora {

    private String nome;
    private String contacto;
    private String morada;
    private boolean assinatura;

    public Transportadora(String nome, String contacto, String morada, boolean assinatura) {
        this.nome = nome;
        this.contacto = contacto;
        this.morada = morada;
        this.assinatura = assinatura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public boolean isAssinatura() {
        return assinatura;
    }

    public void setAssinatura(boolean assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public String toString() {
        return "<" +
                " Nome= " + this.getNome() +
                " Contacto= " + this.getContacto() +
                " Morada= " + this.getMorada()
                + " >"
                ;
    }

}
