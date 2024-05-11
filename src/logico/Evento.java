package logico;

public class Evento {
    private int id;
    private String nome;
    private TipoEvento tipo;

    public Evento(int id, String nome, TipoEvento tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

}
