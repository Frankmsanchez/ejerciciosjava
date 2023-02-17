package Ejercisios.Temas789;

public class CadenaAlreves {
    public static void main(String[] args) {
      System.out.println(reverse("Hola Mundo"));
    }
    public static String reverse(String texto) {
        String invertido = "";
        for(int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }
        return invertido;
    }

}
