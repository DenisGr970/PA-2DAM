package practica1.pkg5_grafos;

import practica1.pkg5_grafos.Grafo;

public class Main {

    public static void main(String[] args) {

        Grafo grafo = new Grafo();

        // Añadir ciudades
        grafo.agregarVertice("Madrid");
        grafo.agregarVertice("Toledo");
        grafo.agregarVertice("Cuenca");
        grafo.agregarVertice("Albacete");

        // Añadir conexiones
        grafo.agregarArista("Madrid", "Toledo",72);
        grafo.agregarArista("Madrid", "Cuenca",168);
        grafo.agregarArista("Toledo", "Albacete",250);
        grafo.agregarArista("Cuenca", "Albacete",140);

        System.out.println("VERTICES:");
        grafo.mostrarVertices();

        System.out.println("\nARISTAS:");
        grafo.mostrarAristas();

        System.out.println("\nCONEXIONES:");
        System.out.println(
                grafo.estanConectados("Madrid", "Toledo")
        );

        System.out.println(
                grafo.estanConectados("Madrid", "Albacete")
        );

        System.out.println();
        grafo.mostrarVecinos("Madrid");

// Método contarVertices()
        grafo.contarVertices();
        // Método contarAristas()
        grafo.contarAristas();

        
        // Ruta de Madrid a Albacete 
        System.out.println("Ruta Madrid a Albacete: " + grafo.buscarRutaDFS("Madrid", "Albacete"));
        
        
        // Eliminamos la conexión entre Toledo y Albacete
        grafo.eliminarArista("Toledo", "Albacete");
        
        // Volvemos a pintar la  ruta
        System.out.println("Ruta tras eliminar Toledo-Albacete: " + grafo.buscarRutaDFS("Madrid", "Albacete"));
        
        
        
        
        // Eliminamos la conexión entre Cuenca y Albacete
        
        grafo.eliminarArista("Cuenca", "Albacete");
          // Volvemos a pintar la  ruta Madrid-Albacete
          
        System.out.println("Ruta tras eliminar Cuenca- Albacete: " + grafo.buscarRutaDFS("Madrid", "Albacete"));
        
        // Comprobamos la ruta Madrid-Madrid
        
        System.out.println("Ruta Madrid a Madrid: " + grafo.buscarRutaDFS("Madrid", "Madrid"));

    }

}
