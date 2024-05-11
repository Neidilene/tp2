package logico;

public class Professor extends Isecmarini implements ModeradorGrupo {
    private String area;
    private String grau;
    private String departamento;
    public Professor(String username, String email, String nome, String apelido, String alcunha, String password, String area, String grau, String departamento){
        super(username,email,nome,apelido,alcunha,password);
        this.area = area;
        this.grau = grau;
        this.departamento = departamento;
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

    @Override
    public void criar() {

    }

    @Override
    public void apagar() {

    }

    @Override
    public void adicionarMembro() {

    }

    @Override
    public void muteMembro() {

    }

    @Override
    public void removerMembro() {

    }

    @Override
    public void moderar() {

    }
}
