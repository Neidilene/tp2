package logico;

public class Funcionario extends Isecmarini implements GestorEvento {
    private String funcao;
    private String uo;

    public Funcionario(String username, String email, String nome, String apelido, String alcunha, String password, String funcao, String uo) {
        super(username, email, nome, apelido, alcunha, password);
        this.funcao = funcao;
        this.uo = uo;
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
