import java.time.LocalDateTime;

public class Grupo {
    private int id;
    private LocalDateTime data;
    private boolean estado;

    public Grupo() {
        int i = 1;
        this.id = i++;
        this.data = LocalDateTime.now();
        this.estado = true;
    }
}
