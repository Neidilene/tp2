package logico;

import java.util.Date;

public class PedradaEvento extends Pedrada {

        private TipoEvento TipoEvento;
        private Date Data;
        private String local;
        private boolean entrada;
        private String status;

        public PedradaEvento(String username, long carimbotempo, int gostos, Comentario comentarios, TipoEvento tipoEvento, Date data, String local, boolean entrada, String status) {
            super(username, carimbotempo, gostos, comentarios);
            TipoEvento = tipoEvento;
            Data = data;
            this.local = local;
            this.entrada = entrada;
            this.status = status;
        }

        public Date getData() {
            return Data;
        }

        public String getStatus() {
            return status;
        }

        public String getLocal() {
            return local;
        }
    }

