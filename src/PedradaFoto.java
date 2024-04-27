public class PedradaFoto extends Pedrada{
    private String nomeficheiro;
    private String legenda;

    public PedradaFoto(String username,long carimbotempo, int gostos, Comentario comentarios, String nomeficheiro, String legenda) {
        super(username, carimbotempo, gostos,comentarios);
        this.nomeficheiro = nomeficheiro;
        this.legenda = legenda;
    }
    public String getNomeficheiro() {
        return nomeficheiro;
    }
    public String getLegenda() {
        return legenda;
    }
}
