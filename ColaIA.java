import java.util.Queue;
import java.util.ArrayDeque;

public class ColaIA {
    public static void main(String[] args) {

        Queue<String> peticiones = new ArrayDeque<>();

        peticiones.offer("Ana");
        peticiones.offer("Luis");
        peticiones.offer("Marta");

        System.out.println("Pendientes: " + peticiones);

        while (!peticiones.isEmpty()) {
            String usuario = peticiones.poll();
            System.out.println("Generando imagen para: " + usuario);
        }
    }
}
