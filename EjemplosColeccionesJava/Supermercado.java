import java.util.ArrayList;

public class Supermercado {
    public static void main(String[] args) {

        ArrayList<String> productos = new ArrayList<>();

        // Añadir productos
        productos.add("Leche");
        productos.add("Pan");
        productos.add("Huevos");
        productos.add("Arroz");
        productos.add("Aceite");

        // Mostrar inventario
        System.out.println("INVENTARIO:");
        for (String producto : productos) {
            System.out.println("- " + producto);
        }

        // Eliminar un producto
        productos.remove("Pan");

        // Comprobar existencias
        if (productos.contains("Leche")) {
            System.out.println("Tenemos leche disponible");
        }

        // Consultar producto por posición
        System.out.println("Primer producto: "
                + productos.get(0));

        // Número de productos
        System.out.println("Total: " + productos.size());
    }
}
