public enum TipoEvento {
    Sentod("Sentod"),
    Festa("Festa"),
    Passeio("Passeio"),
    Visita_Estudo("Visita de Estudo");

    private String descricao;
    TipoEvento(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
