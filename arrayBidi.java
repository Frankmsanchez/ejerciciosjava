package Ejercisios;

public class arrayBidi {
    public static void main(String[] args) {
        int [][] ArrayBIdimensional = {{1,2,3,4,},
                           {5,6,7,8} };

    for (int i = 0; i < ArrayBIdimensional.length; i++) {
    for (int j =0; j < ArrayBIdimensional[i].length; j++){
        System.out.println("El elemento en la posición [" + i + "][" + j + "] es: " + ArrayBIdimensional[i][j]);
    }
    }
    }
}
