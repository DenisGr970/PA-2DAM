public class MiCola {

    private Nodo primero;
    private Nodo ultimo;

    public MiCola() {
        primero = null;
        ultimo = null;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public void encolar(String dato) {
        Nodo nuevo = new Nodo(dato);

        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    public String desencolar() {
        if (estaVacia()) {
            return null;
        }

        String dato = primero.dato;
        primero = primero.siguiente;

        if (primero == null) {
            ultimo = null;
        }

        return dato;
    }

    public String primero() {
        if (estaVacia()) {
            return null;
        }

        return primero.dato;
    }

    public void mostrar() {
        Nodo actual = primero;

        System.out.println("--- COLA ---");

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}
