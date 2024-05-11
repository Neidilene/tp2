package logico;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Isecmarini implements membroRede {
    private String username;
    private String email;
    private String nome;
    private String apelido;
    private String alcunha;
    private String password;
    private ArrayList<Isecmarini> marins;
    private ArrayList<Pedrada> nhaspedrada;
    private boolean visivel;

    public Isecmarini(String username, String email, String nome, String apelido, String alcunha, String password) {
        this.username = username;
        this.email = email;
        this.nome = nome;
        this.apelido = apelido;
        this.alcunha = alcunha;
        this.password = password;
        this.visivel = true;
        this.marins = new ArrayList<Isecmarini>();
        this.nhaspedrada = new ArrayList<Pedrada>();
    }
    public Isecmarini(){
        this.visivel=true;
    }

    public void resetpassword() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza novo password: ");
        this.password = input.next();
        System.out.println("Palavra passe alterada com sucesso");
    }
}