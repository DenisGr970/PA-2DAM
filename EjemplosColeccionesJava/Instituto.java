import java.util.HashMap;
import java.util.Map;

public class Instituto {
    public static void main(String[] args) {

        // Clave: ID del alumno
        // Valor: nota del alumno
        HashMap<Integer, Double> notas = new HashMap<>();

        notas.put(101, 8.5);
        notas.put(102, 6.0);
        notas.put(103, 9.2);
        notas.put(104, 4.5);

        // Buscar la nota de un alumno
        int id = 103;

        if (notas.containsKey(id)) {
            System.out.println("Nota del alumno "
                    + id + ": " + notas.get(id));
        }

        // Actualizar una nota
        notas.put(104, 5.5);

        // Mostrar todos los alumnos
        System.out.println("LISTADO DE NOTAS:");
        for (Map.Entry<Integer, Double> alumno
                : notas.entrySet()) {
            System.out.println("Alumno: " + alumno.getKey()
                    + " | Nota: " + alumno.getValue());
        }

        // Calcular media
        double suma = 0;

        for (double nota : notas.values()) {
            suma += nota;
        }

        double media = suma / notas.size();
        System.out.println("Media del curso: " + media);
    }
}
