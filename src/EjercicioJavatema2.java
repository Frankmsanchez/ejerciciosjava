

public class EjercicioJavatema2 {
    public static void main(String[] args) {
        System.out.println("Este es el precio total de el Articulo:");
     System.out.println(facturaIva(0.13,2220.5));
    }
//Esta funcion toma como parametro el precio inicial y retorna la multiplicacion en este caso por 13%
     static double facturaIva(double iva,double base){
     double resultado= iva+base;
    return resultado;

    }
  
}
