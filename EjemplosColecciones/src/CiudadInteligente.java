import java.util.*;

public class CiudadInteligente {
    public static void main(String[] args) {

        PriorityQueue<String> incidencias =
            new PriorityQueue<>();

        incidencias.offer("3 - Farola averiada");
        incidencias.offer("1 - Accidente grave");
        incidencias.offer("2 - Semáforo roto");

        while (!incidencias.isEmpty()) {
            System.out.println(incidencias.poll());
        }
    }
}
