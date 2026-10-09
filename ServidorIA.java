import java.util.*;

public class ServidorIA {
    public static void main(String[] args) {
        Queue<String> solicitudes = new ArrayDeque<>();

        solicitudes.offer("Ana: generar imagen");
        solicitudes.offer("Luis: resumir PDF");
        solicitudes.offer("Marta: traducir texto");

        while (!solicitudes.isEmpty()) {
            System.out.println("Procesando: "
                    + solicitudes.poll());
        }
    }
}
