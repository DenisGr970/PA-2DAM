package practica1.pkg5_grafos;


import java.util.ArrayList;
import java.util.Deque;

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
    
    
    public void contarVertices() {
        
        int contador = 0;
        
        for(int i = 0; i<vertices.size(); i++) {
            
            contador++;
           
            
        }
        
         System.out.println("Numero de vertices:  " +contador );
        
        
    }
    
    public void contarAristas() {
             int contador = 0;
        
        for(int i = 0; i<aristas.size(); i++) {
            
            contador++;
           
            
        }
        
         System.out.println("Numero de aristas:  " +contador );
        
        
    }
    
    public void eliminarArista(String origen, String destino) {
        
        
        for (Arista a : aristas) {
            System.out.println(a);
            
            if(origen!=null && destino !=null) {
                
                aristas.remove(a);
            
            }
            
            
        }
        
    }
    
    
    public  ArrayList<Vertice> obtenerVecinos (Vertice c) {
        
        ArrayList<Vertice> vecinos = new ArrayList();
        
        if(c == null) {
            
            return vecinos;
            
            
        }
        
        for(Arista a: aristas) {
            
            if(a.getOrigen() == c) {
                
                vecinos.add(a.getDestino());
                
            } else if(a.getDestino() == c) {
                
                vecinos.add(a.getOrigen());
                
            }
            
            
        }
        
        return vecinos; 
        
    }
    
    
    public boolean existeUnaRuta(String origen, String destino) {
        
        if(origen.isEmpty() || destino.isEmpty()) {
            
            System.out.println("La ruta no puede estar vacia");
            return false;
            
        }
        
        
        
        
        
        
    }
    
    
    
}
