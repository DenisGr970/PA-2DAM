public class EjemploReferencias2 {


        public static void main(String[] args) {

            Nodo nodo1;
            Nodo nodo2;
            Nodo nodo3;


            //  Modificar un objeto desde otra referencia
            nodo1=new Nodo("N1");
            nodo2=new Nodo("N2");
            nodo3=nodo2;
            nodo1.siguiente=nodo2;
            nodo3.dato="N2->N3";
            System.out.println(nodo1.dato);
            System.out.println(nodo2.dato);
            System.out.println(nodo3.dato);
            System.out.println(nodo1.siguiente);



        }
    }

