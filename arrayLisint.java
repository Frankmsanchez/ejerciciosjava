package Ejercisios.Temas789;

import java.util.ArrayList;

public class arrayLisint {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 1; i++) {
            numeros.add(i);

        }

        for (int j = 0; j < numeros.size(); j++) {
            if (numeros.get(j) % 2 == 0) {
                numeros.remove(j);
              j--;}
        }
        for (int numero : numeros) {
            System.out.println(numero);
          }
       
    }
}
