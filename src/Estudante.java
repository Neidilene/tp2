import java.time.LocalDateTime;

public class Estudante extends Isecmarini implements GestorEvento{
    private int codigo;
    private String curso;
    private LocalDateTime anoMatricula;
    private int anoCurso;
    private VidaEstudante status;
    public Estudante(String username, String email, String nome, String apelido, String alcunha, String password,
                     int codigo, String curso, LocalDateTime anoMatricula, int anoCurso, VidaEstudante status) {
        super(username, email, nome, apelido,  alcunha, password);
        this.codigo = codigo;
        this.curso = curso;
        this.anoMatricula = anoMatricula;
        this.anoCurso = anoCurso;
        this.status = status;
    }
    public void mandaPaTurma(){

    }

    @Override
    public void novo() {

    }

    @Override
    public void novoRecorrente() {

    }

    @Override
    public void convidar() {

    }

    @Override
    public Pedrada manda(membroRede membro) {
        return null;
    }

    @Override
    public void mostraPerfil() {

    }

    @Override
    public void mudarVisiblidade() {

    }

    @Override
    public void manda() {

    }

    @Override
    public void screveNaPedra(Isecmarini membro) {

    }
}
