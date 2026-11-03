public class NodoDoble {

    String dato;

    NodoDoble anterior;
    NodoDoble siguiente;

    public NodoDoble(String dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
}