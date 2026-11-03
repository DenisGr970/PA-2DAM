import java.util.HashSet;

public class Evento {
    public static void main(String[] args) {

        HashSet<String> asistentes = new HashSet<>();

        asistentes.add("Ana");
        asistentes.add("Carlos");
        asistentes.add("Lucia");
        asistentes.add("Pedro");

        // Intentar registrar a Ana otra vez
        boolean registrado = asistentes.add("Ana");

        if (!registrado) {
            System.out.println("Ana ya estaba registrada");
        }

        // Comprobar asistencia
        String persona = "Carlos";

        if (asistentes.contains(persona)) {
            System.out.println(persona + " está registrado");
        }

        // Eliminar inscripción
        asistentes.remove("Pedro");

        // Mostrar participantes
        System.out.println("ASISTENTES:");
        for (String asistente : asistentes) {
            System.out.println(asistente);
        }

        System.out.println("Total asistentes: "
                + asistentes.size());
    }
}
