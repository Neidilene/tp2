package logico;

import java.util.ArrayList;
import java.util.Scanner;

public class PedradaDigital {
    private ArrayList<Isecmarini> comunidade;
    private String grupos;
    private String eventos;

    public PedradaDigital(String eventos, String grupos) {
        this.grupos = grupos;
        this.eventos = eventos;
        this.comunidade = new ArrayList<Isecmarini>();
    }

    public void signIn() {
        Scanner input = new Scanner(System.in);
        System.out.println("Email: ");
        String password = input.next();
        System.out.println("Password: ");
    }
    public void signUp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Email: ");
        String email = input.next();
        System.out.println("Password: ");
        String password = input.next();
        System.out.println("Account created successfully.");
    }
}
