public class EjemploColaBasico {

    public static void main(String[] args) {

        MiCola cola = new MiCola();

        cola.encolar("Ana");
        cola.encolar("Luis");
        cola.encolar("Eva");

        cola.mostrar();

        System.out.println();
        System.out.println("Primero de la cola: " + cola.primero());

        System.out.println();
        System.out.println("Atendemos a: " + cola.desencolar());

        System.out.println();
        cola.mostrar();
    }
}
