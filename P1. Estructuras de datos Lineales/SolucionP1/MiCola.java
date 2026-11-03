import javax.jws.Oneway;

public class MiCola<Micola> {

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


    // P1. EJERCICIO 5-----------------CONTAR--------------------//

    public int contar() {

        int contador = 0;

        Nodo actual = primero;

        while (actual != null) {

            contador++;

            actual = actual.siguiente;
        }

        return contador;
    }


    // P1. EJERCICIO 6-----------------CONTIENE-------------------//
    public boolean contiene(String x) {

        Nodo actual = primero;

        while (actual != null) {

            if (actual.dato.equals(x)) {
                return true;
            }

            actual = actual.siguiente;
        }

        return false;
    }

    // P1. EJERCICIO 7----------------FUSIONAR -------------------//
    public MiCola fusionar(MiCola otra) {

        MiCola nueva =
                new MiCola();

        Nodo actual = this.primero;

        // Copiamos la primera cola
        while (actual != null) {

            nueva.encolar(actual.dato);

            actual = actual.siguiente;
        }

        // Copiamos la segunda cola
        actual = otra.primero;

        while (actual != null) {

            nueva.encolar(actual.dato);

            actual = actual.siguiente;
        }

        return nueva;
    }

}
