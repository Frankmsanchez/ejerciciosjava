package Ejercisios.Temas789;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class diccionario {
    
        private static Map<String, String> diccionario = new HashMap<>();
        private static List<String> palabras = new ArrayList<String>();
    
        public static void main(String[] args) {
            try {
                agregarPalabra("hola", "saludo");
                agregarPalabra("adios", "despedida");
                agregarPalabra("agua", "líquido transparente Hidratante");
                buscarDefinicion("hola");
                buscarDefinicion("manzana");
                listarDiccionario();
            } catch (IOException e) {
                System.out.println("Error al leer la entrada del usuario.");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    
        public static void agregarPalabra(String palabra, String definicion) throws IOException {
            if (palabra.isEmpty() || definicion.isEmpty()) {
                throw new RuntimeException("La palabra y la definición no pueden estar vacías.");
            }
            if (diccionario.containsKey(palabra)) {
                throw new RuntimeException("La palabra ya existe en el diccionario.");
            }
            diccionario.put(palabra, definicion);
            palabras.add(palabra);
            System.out.println("La palabra '" + palabra + "' se ha agregado al diccionario.");
        }
    
        public static void buscarDefinicion(String palabra) {
            if (diccionario.containsKey(palabra)) {
                System.out.println("La definición de '" + palabra + "' es: " + diccionario.get(palabra));
            } else {
                System.out.println("La palabra '" + palabra + "' no se encontró en el diccionario.");
            }
        }
    
        public static void listarDiccionario() {
            for (String palabra : palabras) {
                System.out.println(palabra + ": " + diccionario.get(palabra));
            }
        }
    
        public static void interactuarConUsuario(InputStream inputStream, PrintStream printStream) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                printStream.println("¿Qué acción deseas realizar? (1: Agregar palabra, 2: Buscar definición, 3: Listar diccionario, 4: Salir)");
                String opcion = reader.readLine();
                if (opcion.equals("1")) {
                    printStream.println("Ingresa la palabra:");
                    String palabra = reader.readLine();
                    printStream.println("Ingresa la definición:");
                    String definicion = reader.readLine();
                    agregarPalabra(palabra, definicion);
                } else if (opcion.equals("2")) {
                    printStream.println("Ingresa la palabra:");
                    String palabra = reader.readLine();
                    buscarDefinicion(palabra);
                } else if (opcion.equals("3")) {
                    listarDiccionario();
                } else if (opcion.equals("4")) {
                    break;
                } else {
                    printStream.println("Opción inválida.");
                }
            }
        
        
    }
}
