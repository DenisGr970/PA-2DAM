public class P1_ListaDoble {

    private NodoDoble primero;
    private NodoDoble cima;

    public P1_ListaDoble() {
        primero = null;
        cima = null;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public void añadirFinal(String dato) {

        NodoDoble nuevo = new NodoDoble(dato);

        if (estaVacia()) {

            primero = nuevo;
            cima= nuevo;

        } else {

           cima.siguiente = nuevo;
           nuevo.anterior = cima;

           cima = nuevo;
        }
    }

    public void mostrarAdelante() {

        NodoDoble actual = primero;

        while (actual != null) {

            System.out.println(actual.dato);

            actual = actual.siguiente;
        }
    }

    public void mostrarAtras() {

        NodoDoble actual = cima;

        while (actual != null) {

            System.out.println(actual.dato);

            actual = actual.anterior;
        }
    }
}