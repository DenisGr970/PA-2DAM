public class EjemploTurnos {

    public static void main(String[] args) {

        MiCola turnos = new MiCola();

        turnos.encolar("Jugador");
        turnos.encolar("Goblin");
        turnos.encolar("Orco");

        for (int i = 0; i < 6; i++) {

            String personaje = turnos.desencolar();

            System.out.println("Turno de: " + personaje);

            turnos.encolar(personaje);
        }
    }
}
