

public class ejercisiotema3 {
    public static void main(String[] args) {
        String[] Nombres = {"Frank", "Maria","Krislany", "familia"};
        String textoConcat="";
       
        for (String nombre:Nombres) {
            System.out.println("Nombre: "+ nombre);
            textoConcat=textoConcat.concat(nombre+" ");
    
    }
    System.out.println("concatenacion: "+textoConcat);

    
}

}
