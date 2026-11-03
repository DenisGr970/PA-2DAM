import java.util.TreeSet;

public class Carrera {
    public static void main(String[] args) {

        // Tiempos expresados en segundos
        TreeSet<Integer> tiempos = new TreeSet<>();

        tiempos.add(350);
        tiempos.add(290);
        tiempos.add(420);
        tiempos.add(310);
        tiempos.add(275);
        tiempos.add(290);

        System.out.println("CLASIFICACION:");

        int posicion = 1;

        for (int tiempo : tiempos) {
            System.out.println(posicion + " puesto: "
                    + tiempo + " segundos");
            posicion++;
        }

        // Mejor tiempo
        System.out.println("Mejor tiempo: "
                + tiempos.first());

        // Peor tiempo
        System.out.println("Peor tiempo: "
                + tiempos.last());

        // Tiempos inferiores a 350 segundos
        System.out.println("Menores de 350: "
                + tiempos.headSet(350));

        // Tiempos superiores o iguales a 310
        System.out.println("Desde 310: "
                + tiempos.tailSet(310));
    }
}
