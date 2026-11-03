import java.util.PriorityQueue;

public class Urgencias {

    public static void main(String[] args) {

        PriorityQueue<Paciente> cola =
                new PriorityQueue<>();

        // Insertamos pacientes
        cola.offer(
                new Paciente("Ana", 2, 1)
        );

        cola.offer(
                new Paciente("Luis", 5, 2)
        );

        cola.offer(
                new Paciente("Marta", 3, 3)
        );

        cola.offer(
                new Paciente("Pedro", 5, 4)
        );

        cola.offer(
                new Paciente("Lucía", 1, 5)
        );

        System.out.println(
                "--- ATENDIENDO PACIENTES ---"
        );

        while (!cola.isEmpty()) {

            Paciente paciente = cola.poll();

            System.out.println(
                    "Atendiendo: " + paciente
            );
        }
    }
}