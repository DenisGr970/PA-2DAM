public class P1_ListaCircular {


        private Nodo primero;
        private Nodo ultimo;

        public P1_ListaCircular() {
            primero = null;
            ultimo = null;
        }

        public boolean estaVacia() {
            return primero == null;
        }

        public void añadirFinal(String dato) {

            Nodo nuevo = new Nodo(dato);

            if (estaVacia()) {

                primero = nuevo;
                ultimo = nuevo;

                // El único nodo apunta a sí mismo
                nuevo.siguiente = nuevo;

            } else {

                // El antiguo último apunta al nuevo
                ultimo.siguiente = nuevo;

                // El nuevo pasa a ser el último
                ultimo = nuevo;

                // Cerramos el círculo
                ultimo.siguiente = primero;
            }
        }

        public void mostrar() {

            if (estaVacia()) {
                return;
            }

            Nodo actual = primero;

            do {
                System.out.println(actual.dato);
                actual = actual.siguiente;

            } while (actual != primero);
        }
    }

