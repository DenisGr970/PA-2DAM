public class PruebaArbol {

    public static void main(String[] args) {
        NodoArbol raiz = new NodoArbol(10);

        raiz.izquierdo = new NodoArbol(5);
        raiz.derecho = new NodoArbol(20);

        raiz.izquierdo.izquierdo = new NodoArbol(2);

        raiz.izquierdo.derecho = new NodoArbol(7);

        raiz.derecho.derecho = new NodoArbol(30);

        System.out.println("raiz.dato"+raiz.dato);
        System.out.println("raiz.izquierdo.dato"+ raiz.izquierdo.dato);
        System.out.println("raiz.izquierdo.derecho.dato"+ raiz.izquierdo.derecho.dato);
        System.out.println("raiz.derecho.derecho.dato"+raiz.derecho.derecho.dato);

    }
}
