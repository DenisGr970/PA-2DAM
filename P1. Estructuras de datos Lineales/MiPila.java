public class MiPila {

    private Nodo cima;

    public MiPila() {
        cima = null;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void push(String dato) {
        Nodo nuevo = new Nodo(dato);

        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public String pop() {
        if (estaVacia()) {
            return null;
        }

        String dato = cima.dato;
        cima = cima.siguiente;

        return dato;
    }

    public String peek() {
        if (estaVacia()) {
            return null;
        }

        return cima.dato;
    }

    public void mostrar() {
        Nodo actual = cima;

        System.out.println("--- PILA ---");

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}
