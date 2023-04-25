//Vinícius Buffon

package trabalhos;

import tools.Entrada;

public class TrabalhoIndependente02 {

    public static class onibus {

        int id;
        String rota;
        String origem;
        String destino;
        int horaPartida;
        int minutosPartida;
        int distancia;
        int tempoViagem;

        public int getTempoViagem() {
            return tempoViagem;
        }

        public void setTempoViagem(int tempoViagem) {
            this.tempoViagem = tempoViagem;
        }

        public onibus(
                int id,
                String origem,
                String destino,
                int distancia,
                int tempoViagem) {

            this.id = id;
            this.origem = origem;
            this.destino = destino;
            this.distancia = distancia;
            this.tempoViagem = tempoViagem;
            
        }

        public onibus(
                int id, String rota,
                String origem,
                String destino,
                int horaPartida,
                int minutosPartida,
                int distancia,
                int tempoViagem) {

            this.id = id;
            this.rota = rota;
            this.origem = origem;
            this.destino = destino;
            this.horaPartida = horaPartida;
            this.minutosPartida = minutosPartida;
            this.distancia = distancia;
            this.tempoViagem = tempoViagem;
        }

        public double calcularConsumo() {
            double consumo = this.distancia / 9.0;
            return consumo;
        }
        
        public double calcularTempoViagem() {
            double tempo = (this.distancia / 80.0) * 60.0;
            return tempo;
        }

    }

    public static void main(String[] args) {

        onibus bus1 = new onibus(
                1,
                "Laheado",
                "Canoas",
                103,
                0);

        onibus bus2 = new onibus(
                2,
                "EST-TOR",
                "Estrela",
                "Torres",
                10,
                30,
                287,
                0);

        Entrada.escrever("O Ônibus 1 irá consumir "
                + bus1.calcularConsumo()
                + " litros de gasolina. Chagando em seu destino depois de "
                + bus1.calcularTempoViagem()
                + " minutos de viagem.");

        Entrada.escrever("O Ônibus 2 irá consumir "
                + bus2.calcularConsumo()
                + " litros de gasolina. Chagando em seu destino depois de "
                + bus2.calcularTempoViagem()
                + " minutos de viagem.");

        System.exit(0);
    }

}
