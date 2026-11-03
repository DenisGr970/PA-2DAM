public class P1_ListaDobleCircular {

        private NodoDoble primero;
        private NodoDoble ultimo;

        public P1_ListaDobleCircular() {
            primero = null;
            ultimo = null;
        }

        public boolean estaVacia() {
            return primero == null;
        }

        public void añadirFinal(String dato) {

            NodoDoble nuevo = new NodoDoble(dato);

            if (estaVacia()) {

                primero = nuevo;
                ultimo = nuevo;

                nuevo.siguiente = nuevo;
                nuevo.anterior = nuevo;

            } else {

                // Nuevo nodo entre ultimo y primero
                nuevo.anterior = ultimo;
                nuevo.siguiente = primero;

                // Actualizamos los extremos
                ultimo.siguiente = nuevo;
                primero.anterior = nuevo;

                // Nuevo pasa a ser el último
                ultimo = nuevo;
            }
        }

        public void mostrarAdelante() {

            if (estaVacia()) {
                return;
            }

            NodoDoble actual = primero;

            do {
                System.out.println(actual.dato);
                actual = actual.siguiente;

            } while (actual != primero);
        }

        public void mostrarAtras() {

            if (estaVacia()) {
                return;
            }

            NodoDoble actual = ultimo;

            do {
                System.out.println(actual.dato);
                actual = actual.anterior;

            } while (actual != ultimo);
        }
    }

