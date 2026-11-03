import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado =
                new Scanner(System.in);

        SolucionJuegoTurnos juego =
                new SolucionJuegoTurnos();

        int opcion;

        do {

            System.out.println();
            System.out.println(
                    "===== JUEGO DE TURNOS ====="
            );

            System.out.println("1. Agregar jugador");
            System.out.println("2. Eliminar jugador");
            System.out.println("3. Mostrar jugadores");
            System.out.println("4. Avanzar turno");
            System.out.println("5. Mostrar jugador actual");
            System.out.println("0. Salir");

            System.out.print(
                    "Seleccione una opción: "
            );

            opcion = teclado.nextInt();
            teclado.nextLine();


            switch (opcion) {

                case 1:

                    System.out.print(
                            "Nombre: "
                    );

                    String nombre =
                            teclado.nextLine();

                    System.out.print(
                            "Puntuación inicial: "
                    );

                    int puntuacion =
                            teclado.nextInt();

                    teclado.nextLine();

                    juego.agregarJugador(
                            nombre,
                            puntuacion
                    );

                    break;


                case 2:

                    System.out.print(
                            "Nombre del jugador: "
                    );

                    String eliminar =
                            teclado.nextLine();

                    juego.eliminarJugador(
                            eliminar
                    );

                    break;


                case 3:

                    System.out.println(
                            "Jugadores actuales:"
                    );

                    juego.mostrarJugadores();

                    break;


                case 4:

                    juego.siguienteTurno();

                    break;


                case 5:

                    NodoJugador actual =
                            juego.getJugadorActual();

                    if (actual == null) {

                        System.out.println(
                                "No hay jugadores."
                        );

                    } else {

                        System.out.println(
                                "Jugador actual: "
                                        + actual
                        );
                    }

                    break;


                case 0:

                    System.out.println(
                            "Fin del juego."
                    );

                    break;


                default:

                    System.out.println(
                            "Opción incorrecta."
                    );
            }

        } while (opcion != 0);

        teclado.close();
    }
}