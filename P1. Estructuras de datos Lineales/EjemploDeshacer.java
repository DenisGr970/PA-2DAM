public class EjemploDeshacer {

    public static void main(String[] args) {

        MiPila acciones = new MiPila();

        acciones.push("Escribir título");
        acciones.push("Insertar imagen");
        acciones.push("Cambiar color");

        System.out.println("Última acción realizada: " + acciones.peek());

        System.out.println();
        System.out.println("Deshacer: " + acciones.pop());

        System.out.println("Ahora la última acción es: " + acciones.peek());
    }
}
