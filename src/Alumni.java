import java.time.LocalDateTime;

public class Alumni extends Estudante{
    private String trabalho;
    private String funcao;
    private String email;

    public Alumni(String username, String email, String nome, String apelido, String alcunha, String password,
                  int codigo, String curso, LocalDateTime anoMatricula, int anoCurso, VidaEstudante status) {
        super(username, email, nome, apelido,alcunha, password, codigo, curso, anoMatricula, anoCurso, status);
    }
}
