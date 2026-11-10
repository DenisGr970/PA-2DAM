package practica1.pkg5_grafos;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;

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
    public void agregarArista(String origen, String destino,double km) { // Modificamos el metodo para la parte extra, agregamos la variable double kilometros

        Vertice v1 = buscarVertice(origen);
        Vertice v2 = buscarVertice(destino);

        if (v1 == null || v2 == null || v1 == v2) {
            System.out.println("No se puede crear la conexión");
            return;
        }

        if (!estanConectados(origen, destino)) {
            aristas.add(new Arista(v1, v2,km));
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

    public int contarVertices() {

        return vertices.size();

    }

    public int contarAristas() {

        return aristas.size();

    }

    public void eliminarArista(String origen, String destino) {

        Vertice v1 = buscarVertice(origen);
        Vertice v2 = buscarVertice(destino);

        if (v1 == null || v2 == null) {
            return;
        }

        for (int i = aristas.size() - 1; i >= 0; i--) {
            Arista a = aristas.get(i);

            if ((a.getOrigen() == v1 && a.getDestino() == v2)
                    || (a.getOrigen() == v2 && a.getDestino() == v1)) {

                aristas.remove(i);
            }
        }

    }

    // PARTE 2
    
    // Ejercicio 1
    public ArrayList<Vertice> obtenerVecinos(Vertice c) {

        ArrayList<Vertice> vecinos = new ArrayList();

        if (c == null) {

            return vecinos;

        }

        // Recorremos las aristas - las aristas tienen varias direcciones y tenemos que comprobar los extremos de la arista
        for (Arista a : aristas) {

            if (a.getOrigen() == c) {

                vecinos.add(a.getDestino());
// Si el vertice se llama Madrid u otra ciudad, se añadirá en el destino
            } else if (a.getDestino() == c) {

                vecinos.add(a.getOrigen());
// Si el vertice se llama Madrid u otra ciudad, se añadirá en el origen
            }

        }

        return vecinos;

    }

    // Ejercicio 2
    public boolean existeUnaRuta(String origen, String destino) {

        if (origen.isEmpty() || destino.isEmpty()) {

            System.out.println("Los parametros no pueden estar vacio");
            return false;

        }
// creamos los objetos Vertice y llamamos el metodo buscarVertice()
        Vertice inicio = buscarVertice(origen);
        Vertice fin = buscarVertice(destino);

        if (inicio == null || fin == null) {

            return false;

        }
// Con Deque y ArrayDeque, guardamos las ciudades que queremos visitar,
        Deque<Vertice> pila = new ArrayDeque<>();
        
        // En el arraylist guardamos las ciudades que pisamos
        ArrayList<Vertice> visitados = new ArrayList<>();

        pila.push(inicio);

        // Hacemos pop mientras que la lista deque no esté vacía
        while (!pila.isEmpty()) {
            Vertice actual = pila.pop();

            // Ejercicio 3 //
            
            // guardamos la ciudad actual que visitamos y la metemos en el arraylist
            if (!visitados.contains(actual)) {
                System.out.println("Visitando: " + actual.getNombre());
                visitados.add(actual);

                if (actual == fin) {
                    System.out.println("Destino encontrado");
                    return true;
                   
                    // Si la ciudad actual es igual a fin, paramos el ejercicio
                    
                }
                // Ejercicio 3
                
                // Hacemos un for para sacar los vecinos
                for (Vertice vecino : obtenerVecinos(actual)) {
                    if (!visitados.contains(vecino)) {
                        pila.push(vecino);
                    }
                }
            }

        }
        return false;
    }

    // Ejercicio 4
    public ArrayList<Vertice> buscarRutaDFS(String origen, String destino) {

        // creamos los objetos Vertice y llamamos el metodo buscarVertice()
        
        // Creamos el arraylist para guardar las rutas que vayamos teniendo
        ArrayList<Vertice> ruta = new ArrayList<>();
        Vertice inicio = buscarVertice(origen);
        Vertice fin = buscarVertice(destino);

        if (inicio == null || fin == null) {

            return ruta;

        }

        Deque<Vertice> pila = new ArrayDeque();
        ArrayList<Vertice> visitados = new ArrayList();
        // Utilizamos Hashmap porque necesitamos tener el inicio y el fin de la ruta, el hashmap guarda las dos cosas
        HashMap<Vertice, Vertice> anteriores = new HashMap<>();

        pila.push(inicio);
        visitados.add(inicio);

        while (!pila.isEmpty()) {
            Vertice actual = pila.pop();

            if (actual == fin) {

                Vertice paso = fin;

                while (paso != null) {

                    ruta.add(paso);
                    paso = anteriores.get(paso);

                }
                
    
                return ruta;

            }

            // Hacemos for para sacar los vecinos
            for (Vertice vecino : obtenerVecinos(actual)) {

                if (!visitados.contains(vecino)) {

                    visitados.add(vecino);
                    anteriores.put(vecino, actual);
                    pila.push(vecino);

                }

            }
        }
        return ruta;

    }

    // Ejercicio 4
}
