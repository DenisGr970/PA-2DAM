import java.util.*;

public class ErrorDatosDuplicados {
    public static void main(String[] args) {

        List<Integer> datos = Arrays.asList(
            101, 102, 103, 101, 104, 102, 105
        );

        List<Integer> lista = new ArrayList<>(datos);
        Set<Integer> conjunto = new HashSet<>(datos);

        System.out.println("Lista: " + lista);
        System.out.println("Total lista: " + lista.size());

        System.out.println("Conjunto: " + conjunto);
        System.out.println("Total únicos: " + conjunto.size());
    }
}
