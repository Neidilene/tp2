public abstract class Pedrada {

    private static int nextID = 1;
    private int id;
    private String username;
    private long carimbotempo;
    private int gostos;
    private Comentario comentarios;

    public Pedrada(String username, long carimbotempo, int gostos, Comentario comentarios) {
        this.id = nextID++;
        this.username = username;
        this.carimbotempo = carimbotempo;
        this.gostos = gostos;
        this.comentarios = comentarios;
    }
    public void gostos() {
        gostos++;
    }
    public Comentario masriola() {
        return masriola();
    }
    public long getCarimboTempo() {
        return carimbotempo;
    }
    public void display() {
        System.out.println("ID: "+id);
        System.out.println("Autor: "+username);
        System.out.println("Carimbo de Tempo: " +carimbotempo);
        System.out.println("Gostos: " +gostos);
        System.out.println("Comentários: " +comentarios);
    }
}
