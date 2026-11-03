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


// P1. EJERCICIO 2-----------------CONTAR--------------------//
    public int contar() {

        int contador = 0;

        Nodo actual = cima;

        while (actual != null) {

            contador++;

            actual = actual.siguiente;
        }

        return contador;
    }

    // P1. EJERCICIO 3----------------CONTIENE--------//
    public boolean contiene(String x) {

        Nodo actual = cima;

        while (actual != null) {

            if (actual.dato.equals(x)) {
                return true;
            }

            actual = actual.siguiente;
        }

        return false;
    }

   // P1. EJERCICIO 4----------------POSICIÓN------------//
   public int posicion(String x) {

       Nodo actual = cima;

       int posicion = 1;

       while (actual != null) {

           if (actual.dato.equals(x)) {
               return posicion;
           }

           posicion++;

           actual = actual.siguiente;
       }

       return -1;
   }
}
