public class EjemploReferencia3 {

    public static void main(String[] args) {

        NodoDoble nodo1;
        NodoDoble nodo2;
        NodoDoble nodo3;

        nodo1=new NodoDoble("N1");
        nodo2=new NodoDoble("N2");
        nodo3=new NodoDoble("N3");
        nodo1.siguiente=nodo2;
        nodo1.anterior=nodo3;
        nodo2.siguiente=nodo3;
        nodo2.anterior=nodo1;
        nodo3.siguiente=nodo1;
        nodo3.anterior=nodo2;

        NodoDoble actual = nodo1;

        for (int i = 0; i < 5; i++) {

            System.out.println(actual.dato);
            actual = actual.siguiente;
        }


    }
}

