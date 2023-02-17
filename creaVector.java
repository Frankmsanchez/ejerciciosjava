package Ejercisios.Temas789;

import java.util.Vector;

public class creaVector {

    public static void main(String[] args) {
        Vector<String> miVector = new Vector<String>();
        miVector.add("Elemeto 1");
        miVector.add("Elemento 2");
        miVector.add("Elemento 3");
        miVector.add("Elemeto 4");
        miVector.add("Elemeto 5");

        miVector.remove("Elemento 2");
        miVector.remove("Elemento 3");

        System.out.println("El Vector resultante es: ");
        for (int i = 0; i < miVector.size(); i++) {
            System.out.println(miVector.get(i));
        }
    }
}
/*
 * Indica cuál es el problema de utilizar un Vector con la capacidad por defecto
 * si tuviésemos 1000 elementos para ser añadidos al mismo.
 * 
 * Que se cada vez que se deja el vector con los valores por defecto y llega asu
 * punto maximo crea una un nuevo vector con una capacidad mayor osea la duplica
 * y luego descarta el vector original lo que causa mucha carga a la memoria por eso lo
 * recomendable es establecer la capacidad inicial de un vector segun la
 * cantidad de elementos esperados para que sea mas eficiente
 */