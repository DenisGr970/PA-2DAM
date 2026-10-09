import java.util.Deque;
import java.util.ArrayDeque;

public class EditorIA {
    public static void main(String[] args) {

        Deque<String> historial = new ArrayDeque<>();

        historial.push("Aplicar filtro");
        historial.push("Eliminar objeto");
        historial.push("Cambiar fondo");

        System.out.println("Historial: " + historial);

        System.out.println("Deshacer: " + historial.pop());
        System.out.println("Deshacer: " + historial.pop());

        System.out.println("Pendiente: " + historial);
    }
}
