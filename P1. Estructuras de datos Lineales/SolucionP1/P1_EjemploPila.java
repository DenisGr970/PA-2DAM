public class P1_EjemploPila {


        public static void main(String[] args) {

            MiPila pila = new MiPila();

            pila.push("Google");
            pila.push("YouTube");
            pila.push("Wikipedia");

            pila.mostrar();

            System.out.println(
                    "Número de nodos: "
                            + pila.contar()
            );

            System.out.println(
                    "¿Contiene YouTube? "
                            + pila.contiene("YouTube")
            );

            System.out.println(
                    "Posición de YouTube: "
                            + pila.posicion("YouTube")
            );

            System.out.println(
                    "Posición de Amazon: "
                            + pila.posicion("Amazon")
            );
        }
    }

