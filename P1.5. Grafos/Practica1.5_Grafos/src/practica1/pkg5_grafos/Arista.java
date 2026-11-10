package practica1.pkg5_grafos;


public class Arista {

    private Vertice origen;
    private Vertice destino;
    private double km; // Parte extra
    
    public Arista(Vertice origen, Vertice destino, Double km) {
        this.origen = origen;
        this.destino = destino;
        this.km = km;
        
    }

    public Vertice getOrigen() {
        return origen;
    }

    public Vertice getDestino() {
        return destino;
    }
    
    public double getKilometros() {
        
        return km;
        
    }
    

    @Override
    public String toString() {
        return origen.getNombre()+ " <-> " + destino.getNombre() + " " + km + "Km";
    }
}
    
