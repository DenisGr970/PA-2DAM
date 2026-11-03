import java.time.LocalTime;
import java.util.Map;
import java.util.TreeMap;

public class Clinica {
    public static void main(String[] args) {

        TreeMap<LocalTime, String> citas = new TreeMap<>();

        citas.put(LocalTime.of(11, 30), "Maria");
        citas.put(LocalTime.of(9, 0), "Pedro");
        citas.put(LocalTime.of(10, 15), "Lucia");
        citas.put(LocalTime.of(12, 0), "Carlos");

        // Mostrar agenda ordenada
        System.out.println("AGENDA DEL MEDICO:");

        for (Map.Entry<LocalTime, String> cita
                : citas.entrySet()) {
            System.out.println(cita.getKey()
                    + " - " + cita.getValue());
        }

        // Primera cita
        System.out.println("Primera cita: "
                + citas.firstEntry());

        // Cancelar una cita
        citas.remove(LocalTime.of(10, 15));

        // Buscar siguiente cita a partir de las 10:00
        Map.Entry<LocalTime, String> siguiente =
                citas.ceilingEntry(LocalTime.of(10, 0));

        if (siguiente != null) {
            System.out.println("Siguiente cita: "
                    + siguiente);
        }

        System.out.println("Citas restantes: "
                + citas.size());
    }
}
