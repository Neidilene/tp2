package logico;

import java.util.Date;

public class Teste {


        public static void main(String[] args)  {

            Comentario comentario1 = new Comentario("familia 1", new Date());
            PedradaFoto foto = new PedradaFoto("Maria_dias", new Date().getTime(), 0, comentario1, "foto.jpg", "minha familia");
            PedradaEvento evento = new PedradaEvento("neidi_tavares", new Date().getTime(), 0,null, TipoEvento.Festa, new Date(), "Local do evento", true, "Confirmado");
            PedradaMensagem mensagem = new PedradaMensagem("paulo_silva", new Date().getTime(), 0, null, "Segue-se o enunciado do teste 2");
            Riola riola = new Riola();
            riola.addPedrada(foto);
            riola.addPedrada(evento);
            riola.addPedrada(mensagem);
            riola.show();
        }
    }


