public class EjemploNavegador {

    public static void main(String[] args) {

        MiPila historial = new MiPila();

        String paginaActual = "Google";

        System.out.println("Página actual: " + paginaActual);

        historial.push(paginaActual);
        paginaActual = "YouTube";
        System.out.println("Visitamos: " + paginaActual);

        historial.push(paginaActual);
        paginaActual = "Wikipedia";
        System.out.println("Visitamos: " + paginaActual);

        System.out.println();
        System.out.println("Pulsamos ATRÁS");

        paginaActual = historial.pop();
        System.out.println("Página actual: " + paginaActual);

        System.out.println();
        System.out.println("Pulsamos ATRÁS otra vez");

        paginaActual = historial.pop();
        System.out.println("Página actual: " + paginaActual);
    }
}
