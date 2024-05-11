package logico;

import java.util.ArrayList;
import java.util.Date;

public class Riola {
    private ArrayList<Pedrada> pedradas;
    public Riola() {
        this.pedradas = new ArrayList<Pedrada>();
    }
    public void addPedrada(Pedrada pedrada) {
        pedradas.add(pedrada);
    }
    public void show() {
        Date dataAtual = new Date();

        for (Pedrada pedrada : pedradas) {
            if (dataAtual.getTime() - pedrada.getCarimboTempo() <= 24 * 60 * 60 * 1000) {
                pedrada.display();
                System.out.println();
            }
        }
    }
}

