public class EjemploPilaBasico {

    public static void main(String[] args) {

        MiPila pila = new MiPila();

        pila.push("Google");
        pila.push("YouTube");
        pila.push("Wikipedia");

        pila.mostrar();

        System.out.println();
        System.out.println("Elemento de la cima: " + pila.peek());

        System.out.println();
        System.out.println("Extraemos: " + pila.pop());

        System.out.println();
        pila.mostrar();
    }
}
