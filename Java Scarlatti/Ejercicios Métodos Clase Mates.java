import java.util.Scanner;

/*  MÉTODOS EN JAVA

Los métodos en Java son el equivalente a los procedimientos de Logo y de otros
lenguajes de programación. A veces se les llama también funciones.

Podemos pasarles valores (parámetros) y devolver un valor.
Cuando definimos un método le damos un nombre y una serie de modificadores.
De momento crearemos métodos estáticos (static) que pueden devolver valores 
(int, byte, String...) o no (void) y que pueden recibir parámetros (0 o más),
indicando su tipo y separados por comas. Observa los ejemplos del programa.


Para practicar, vamos a realizar una clase denominada Mates con métodos
matemáticos un poco particulares.

A partir del esqueleto que aparece más abajo, debes codificar y probar
los métodos que se especifican.




Referencias:
Básico: https://www.w3schools.com/java/java_methods.asp
Para más adelante: 
https://www.tutorialspoint.com/java/java_methods.htm

*/


public class Mates {

/*	
  static int resto(int x, int y) {
    // este método debe devolver el resto de dividir x entre y pero...
	// NO puedes utilizar el operador %. Debes realizar restas sucesivas (!?)
  }
*/ 

/*
  static int cociente(int dividendo, int divisor) {
    // este método debe devolver el cociente de dividir dividendo entre divisor pero...
	// NO puedes utilizar el operador /. Debes realizar restas sucesivas...
	// Eso es la división después de todo, ¿no?

  }
*/
 
 /*
  static double areaRectangulo(double base, double altura) {
      // Un clásico...
  }
  
  */
  
  /* 
  static void mensajeError() {
	  // este método no recibe ni devuelve ningún valor: solo imprime un mensaje por pantalla
	  
	  return;  // observa que el return no devuelve ningún valor
  }
  */
  
  /*
  static boolean esImpar(int num) {
     // devuelve true si el número es impar. Si no, false...
  }
  */
  

  /*
  static boolean esPar(int num) {
     // similar al anterior...
  }
  */

  public static void main(String[] args) {
    
	// creamos un objeto Scanner para leer por teclado
	Scanner lector = new Scanner(System.in);
	
	// aquí debes probar los métodos de la clase
	// como ejemplo, vamos a probar unos cuantos
	
	System.out.println("Introduce el dividendo: ");
	int a = lector.nextInt();
	
	System.out.println("Introduce el divisor: ");
	int b = lector.nextInt();
	
	int r = resto(a, b);
	int c = cociente(a, b);
	
	System.out.println("El resto de dividir " + a + " entre " + b + " es: " + r);
	System.out.println("El cociente de dividir " + a + " entre " + b + " es: " + c);
	
    System.out.println("Introduce un número para comprobar si es par: ");
	c = lector.nextInt();
	
	if (esPar(c)) {
		System.out.println("El número " + c + " es par.");
	}
	else {
		System.out.println("El número " + c + " es impar.");
	}
	
	// Pruena los demás métodos...
	
    
  }
}