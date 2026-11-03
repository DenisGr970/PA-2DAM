public class EjemploReferencias {


    public static void main(String[] args) {

       Nodo nodo1;
       Nodo nodo2;
       Nodo nodo3;
       Nodo nodo4;


       // Dos referencias al mismo nodo nodo2 y nodo3 apuntan al mismo nodo
      nodo1=null;
      nodo2=new Nodo("nodo2");
      nodo3=nodo2;
      nodo4=new Nodo("nodo4");
      nodo2.siguiente=nodo4;
      System.out.println(nodo2.siguiente.dato);
      System.out.println(nodo1);
    }
}
