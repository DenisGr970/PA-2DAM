public class Paciente implements Comparable<Paciente> {

        private String nombre;
        private int gravedad;
        private int ordenLlegada;

        public Paciente(String nombre, int gravedad, int ordenLlegada) {
            this.nombre = nombre;
            this.gravedad = gravedad;
            this.ordenLlegada = ordenLlegada;
        }

        public String getNombre() {
            return nombre;
        }

        public int getGravedad() {
            return gravedad;
        }

        public int getOrdenLlegada() {
            return ordenLlegada;
        }

        @Override
        public int compareTo(Paciente otro) {

            // Primero: mayor gravedad
            if (this.gravedad != otro.gravedad) {
                return otro.gravedad - this.gravedad;
            }

            // Si tienen la misma gravedad:
            // primero el que llegó antes
            return this.ordenLlegada - otro.ordenLlegada;
        }

        @Override
        public String toString() {
            return nombre
                    + " - gravedad: " + gravedad
                    + " - llegada: " + ordenLlegada;
        }
    }

