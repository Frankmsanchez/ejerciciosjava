package Ejercisios.Temas789;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.FileInputStream;
public class inputS {
    public static void main(String[] args) {
    String fileIn = "input.txt";
    String fileOut = "output.txt";
    copiarArchivo(fileIn, fileOut);
  }

  public static void copiarArchivo(String fileIn, String fileOut) {
    try {
      InputStream inputStream = new FileInputStream(fileIn);
      PrintStream printStream = new PrintStream(new FileOutputStream(fileOut));
      int i = 0;
      while ((i = inputStream.read()) != -1) {
        printStream.write(i);
      }
      inputStream.close();
      printStream.close();
      System.out.println("El archivo se ha copiado correctamente.");
    } catch (FileNotFoundException e) {
      System.out.println("El archivo no se encontró.");
    } catch (IOException e) {
      System.out.println("Error al copiar el archivo.");
    }
  }


    }

