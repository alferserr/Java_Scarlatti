
import java.util.Scanner;

public class Cadenas {

   public static void main(String[] args) {
		
      Scanner reader = new Scanner(System.in);
	  
	  System.out.println(args[0]);
	  System.out.println(args[1]);
	  
	  // tipo String ->  es una clase
	  // String nombre = "John Doe";  // nombre es un objeto de la clase String
	  
	  String nombre = new String("John Doe");   // usando un constructor...
	  
	  // La clase String tiene muuuchoos métodos.
	  // Por ejemplo, para pasar un string a mayúsculas.
	  
	  // Vamos a utilizarlo
	  String nombre2 =  nombre.toUpperCase();  // no modifica la cadena original
	  
	  System.out.println("Nombre original: " + nombre);
	  System.out.println("Nombre en mayusculas: " + nombre2);
	  
	  // pasar a minúsculas nombre 
	  nombre = nombre.toLowerCase();
	  System.out.println("Nombre en minusculas: " + nombre);
	  
      
	  // Crear un array para 4 Strings
	  String[] strArray = new String[4];
	  // ejercicio: leer cuatro Strings con el método nextLine del Scanner
	  strArray[0] = "Primera cadena";
	  strArray[1] = "SEGUNDA cadena";
	  strArray[2] = "tERCERA cadena";
	  strArray[3] = "cuarta Cadena";
	  
	  aMinusculas(strArray);
	  
	  // Vamos a pasar el array al método:
	  //   public void aMinusculas(String[] cadenas)
	  //  que debe pasar el contenido de todas los strings del array a minusculas
	  
	  // imprimir el array de cadenas
	  	for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}

	}
	
	public static void aMinusculas(String[] cadenas) {
		for(int i=0; i<cadenas.length; i++) {
			cadenas[i] = cadenas[i].toLowerCase();
		}
		
	}
		
}