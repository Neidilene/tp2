import java.util.Date;

public class Comentario {

        private String texto;
        private Date hora;
        private int gostos;
    public Comentario(String texto, Date hora) {
        this.texto = texto;
        this.hora = hora;
        this.gostos = 0;
    }
    public void responder(String texto, Date hora) {
        Comentario resposta = new Comentario(texto, hora);
    }

    public void gostos() {
        gostos++;
    }
    public void tragostos() {
        if (gostos > 0) {
            gostos--;
        }
    }
}


