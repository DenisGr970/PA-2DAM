public class EjemploImpresora {

    public static void main(String[] args) {

        MiCola impresora = new MiCola();

        impresora.encolar("Informe.pdf");
        impresora.encolar("Factura.pdf");
        impresora.encolar("Notas.pdf");

        System.out.println("Documentos pendientes:");
        impresora.mostrar();

        System.out.println();
        System.out.println("Imprimiendo: " + impresora.desencolar());

        System.out.println();
        System.out.println("Documentos que quedan:");
        impresora.mostrar();
    }
}
