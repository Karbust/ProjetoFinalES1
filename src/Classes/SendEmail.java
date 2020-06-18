package Classes;

public class SendEmail {

    private Encomenda info;
    private String Mensagem;


    public SendEmail(Encomenda info, String mensagem) {
        this.info = info;
        Mensagem = mensagem;
    }

    public Encomenda getInfo() {
        return info;
    }

    public void setInfo(Encomenda info) {
        this.info = info;
    }

    public String getMensagem() {
        return Mensagem;
    }

    public void setMensagem(String mensagem) {
        Mensagem = mensagem;
    }
}
