package Ejercisios.Temas789;

public class divPorcero {
        public static void main(String[] args) {
          try {
            int resultado = DividePorCero(10, 0);
            System.out.println("El resultado es: " + resultado);
          } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
          } finally {
            System.out.println("Demo de código");
          }
        }
      
        public static int DividePorCero(int num1, int num2) throws ArithmeticException {
          if (num2 == 0) {
            throw new ArithmeticException();
          }
          return num1 / num2;
        }
      
      
}
