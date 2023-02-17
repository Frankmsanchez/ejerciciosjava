package Ejercisios.Temas789;

import java.util.ArrayList;
import java.util.*;



public class ArraylistS {
    public static void main(String[] args) {
        
        ArrayList<String> miArray = new ArrayList<String>();

        miArray.add("Elemento numer 1 ");
        miArray.add("Elemento numer 2 ");
        miArray.add("Elemento numer 3 ");
        miArray.add("Elemento numer 4 ");

LinkedList<String> LinkedList = new LinkedList<String>(miArray); 
System.out.println("Los valores de mi ArrayList: ");
for(String elemento: LinkedList){
    System.out.println(elemento);
}

    }
}
