public class CListaCircularSE {

    private NodoJugador primero;
    private NodoJugador ultimo;

    public CListaCircularSE() {
        primero = null;
        ultimo = null;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public NodoJugador getPrimero() {
        return primero;
    }

    public void agregar(String nombre, int puntuacion) {

        NodoJugador nuevo =
                new NodoJugador(nombre, puntuacion);

        if (estaVacia()) {

            primero = nuevo;
            ultimo = nuevo;

            nuevo.siguiente = nuevo;

        } else {

            ultimo.siguiente = nuevo;
            ultimo = nuevo;

            ultimo.siguiente = primero;
        }
    }

    public NodoJugador buscar(String nombre) {

        if (estaVacia()) {
            return null;
        }

        NodoJugador actual = primero;

        do {

            if (actual.getNombre()
                    .equalsIgnoreCase(nombre)) {

                return actual;
            }

            actual = actual.siguiente;

        } while (actual != primero);

        return null;
    }

    public void mostrar() {

        if (estaVacia()) {
            System.out.println("No hay jugadores.");
            return;
        }

        NodoJugador actual = primero;

        do {

            System.out.print(
                    "[" + actual + "] -> "
            );

            actual = actual.siguiente;

        } while (actual != primero);

        System.out.println(
                "(vuelve a " +
                        primero.getNombre() + ")"
        );
    }

    public void eliminar(String nombre) {

        if (estaVacia()) {
            return;
        }

        NodoJugador actual = primero;
        NodoJugador anterior = ultimo;

        do {

            if (actual.getNombre()
                    .equalsIgnoreCase(nombre)) {

                // Solo existe un jugador
                if (actual == primero &&
                        actual == ultimo) {

                    primero = null;
                    ultimo = null;
                }

                // Eliminamos el primero
                else if (actual == primero) {

                    primero = primero.siguiente;
                    ultimo.siguiente = primero;
                }

                // Eliminamos el último
                else if (actual == ultimo) {

                    ultimo = anterior;
                    ultimo.siguiente = primero;
                }

                // Nodo intermedio
                else {

                    anterior.siguiente =
                            actual.siguiente;
                }

                return;
            }

            anterior = actual;
            actual = actual.siguiente;

        } while (actual != primero);
    }
}