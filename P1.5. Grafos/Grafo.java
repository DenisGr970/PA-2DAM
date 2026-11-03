
import java.util.ArrayList;

public class Grafo {

    private ArrayList<Vertice> vertices;
    private ArrayList<Arista> aristas;

    public Grafo() {
        vertices = new ArrayList<>();
        aristas = new ArrayList<>();
    }

    // Buscar un vértice por su nombre
    public Vertice buscarVertice(String nombre) {

        for (Vertice v : vertices) {
            if (v.getNombre().equals(nombre)) {
                return v;
            }
        }

        return null;
    }

    // Añadir un nuevo vértice
    public void agregarVertice(String nombre) {

        if (buscarVertice(nombre) == null) {
            vertices.add(new Vertice(nombre));
        }
    }

    // Añadir una arista entre dos vértices
    public void agregarArista(String origen, String destino) {

        Vertice v1 = buscarVertice(origen);
        Vertice v2 = buscarVertice(destino);

        if (v1 == null || v2 == null || v1 == v2) {
            System.out.println("No se puede crear la conexión");
            return;
        }

        if (!estanConectados(origen, destino)) {
            aristas.add(new Arista(v1, v2));
        }
    }

    // Comprobar conexión directa
    public boolean estanConectados(String origen, String destino) {

        Vertice v1 = buscarVertice(origen);
        Vertice v2 = buscarVertice(destino);

        if (v1 == null || v2 == null) {
            return false;
        }

        for (Arista a : aristas) {

            if ((a.getOrigen() == v1 && a.getDestino() == v2)
                    || (a.getOrigen() == v2 && a.getDestino() == v1)) {
                return true;
            }
        }

        return false;
    }

    // Mostrar los vértices
    public void mostrarVertices() {

        for (Vertice v : vertices) {
            System.out.println(v);
        }
    }

    // Mostrar todas las aristas
    public void mostrarAristas() {

        for (Arista a : aristas) {
            System.out.println(a);
        }
    }

    // Mostrar los vecinos de un vértice
    public void mostrarVecinos(String nombre) {

        Vertice v = buscarVertice(nombre);

        if (v == null) {
            System.out.println("El vértice no existe");
            return;
        }

        System.out.println("Vecinos de " + nombre + ":");

        for (Arista a : aristas) {

            if (a.getOrigen() == v) {
                System.out.println(a.getDestino());
            } else if (a.getDestino() == v) {
                System.out.println(a.getOrigen());
            }
        }
    }
}
