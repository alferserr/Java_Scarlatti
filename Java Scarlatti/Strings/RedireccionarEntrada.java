/* 
  Cuando leemos datos por teclado estamos tomando datos de un canal 
  denominado entrada estándar (standar input). Podemos hacer que la entrada de 
  datos provenga de otro programa o de un fichero de la siguiente forma:
  
  En Windows, en la consola:
  a) leer datos que produce otro programa.
     type fichero_datos.txt | java programaJava1
  
     El símbolo "|" representa un "pipe" o tubería.
	 Se pueden añadir más tuberías:
	 type fichero_datos.txt | java programaJava1 | java programaJava2
	 
  b) Hacer que los datos se tomen desde fichero.
  
     java programaJava1 < fichero_datos.txt
	 
 
    


*/
import java.util.Scanner;


public class RedireccionarEntrada {
	
    public static void main(String [] args) {
		
		/* graba en el directorio de trabajo un fichero llamado texto.txt con el siguiente 
		   contenido:
		   Hola.
		   Bienvenido.
		   Hasta luego.
		   
		   Tres líneas en total. Realiza pruebas redireccionando la entrada estándar.
		 */
		
		Scanner lector = new Scanner(System.in);
		
		String cadena = lector.nextLine();
		System.out.println("Leido por consaola: " + cadena);
		
		cadena = lector.nextLine();
		System.out.println("Leido por consaola: " + cadena);
		
		cadena = lector.nextLine();
		System.out.println("Leido por consaola: " + cadena);
				
	}
}


/* 
   Ejercicio 1:
      El problema "Cameos de Stan Lee" de Acepta el Reto:
	  https://www.aceptaelreto.com/problem/statement.php?id=475
	  nos plantea una entrada de datos como la siguiente (sin las líneas en blanco):
	  
	  5
      Que me diga donde estan, le exijo!
      Eres tan lento que te ganaria una oruga. Calla y salta, no le temas.
      Esto es canela, verdad que si?
      Stan Stan Lee Lee
      Stan Loo
	  
	  Crea un fichero de datos llamado test1.txt y haz un programa que lo lea e imprima para cada línea de texto
	  cuántos caracteres hay en la cadena.
	  
	  
	  
   Ejercicio 2: 
      El problema "Constante de Kaprekar" de Acepta el Reto:
	  https://www.aceptaelreto.com/problem/statement.php?id=100
	  nos plantea una entrada de datos como la siguiente (sin las líneas en blanco):
	  
	  5
      3524
      1111
      1121
      6174
      1893
	  Crea un fichero de datos llamado test2.txt y haz un programa que lo lea y almacene los números 
	  en un array (no el primero, que es el número de casos). Imprime todos los números antes de terminar
	  
	   
      
*/