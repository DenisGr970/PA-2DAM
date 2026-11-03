import java.util.LinkedList;

public class Playlist {
    public static void main(String[] args) {

        LinkedList<String> canciones = new LinkedList<>();

        canciones.add("Bad Bunny");
        canciones.add("Rosalía");
        canciones.add("Quevedo");

        System.out.println(canciones);

        canciones.addFirst("Aitana");
        System.out.println(canciones);

        canciones.remove("Rosalía");
        System.out.println(canciones);

        System.out.println("Primera: " + canciones.getFirst());
        System.out.println("Última: " + canciones.getLast());
    }
}
