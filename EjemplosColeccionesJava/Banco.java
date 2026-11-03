import java.util.LinkedList;

public class Banco {
    public static void main(String[] args) {

        LinkedList<String> cola = new LinkedList<>();

        // Llegan clientes
        cola.addLast("Ana");
        cola.addLast("Pedro");
        cola.addLast("Maria");
        cola.addLast("Luis");

        System.out.println("Cola inicial: " + cola);

        // Atender primer cliente
        String atendido = cola.pollFirst();
        System.out.println("Atendiendo a: " + atendido);

        // Llega otro cliente
        cola.addLast("Carlos");

        // Consultar siguiente sin eliminarlo
        System.out.println("Siguiente: "
                + cola.peekFirst());

        // Atender a todos
        while (!cola.isEmpty()) {
            System.out.println("Atendiendo a: "
                    + cola.pollFirst());
        }

        System.out.println("Clientes pendientes: "
                + cola.size());
    }
}
