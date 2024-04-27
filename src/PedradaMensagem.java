public class PedradaMensagem extends Pedrada{
    private String Mensagem;

    public PedradaMensagem(String username, long carimbotempo, int gostos, Comentario comentarios, String Mensagem) {
        super(username, carimbotempo, gostos, comentarios);
        this.Mensagem = Mensagem;
    }
    public String getMensagem() {
        return Mensagem;
    }
}
