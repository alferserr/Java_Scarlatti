public class Metodos {


  public static void main(String[] args) {
	
	int nota = redondeaNota(7.5d);
	System.out.println(nota);
	
	nota = redondeaNota(7.1d);
	System.out.println(nota);
	
	nota = redondeaNota(4.5d);
	System.out.println(nota);
  }
  
  public static int redondeaNota(double nota) {
	  // nuestro código... ver Math.round();
	  // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html
	  int resul;
	  if !(nota>=4.0 && nota < 5.0) {
		  resul = (int) Math.round(nota); // round está sobrecargado!!
	  } else {
		  resul = 4;
	  }
	  
	  // otra forma: if (nota<4.0 || nota >=5) ... operador OR 
	  return resul; // int
  }
}

/* Ej. 1
       Codificar el método redondeaNota que recibe una nota
	   con decimales y devuelve el valor entero más cercano,
	   excepto para los valores comprendidos entre 4.0 y 5, que
	   será 4.
   Ej. 2
       Escribir la declaración (primera línea) de los siguientes 
	   métodos:
	   - hipotenusa: le pasamos los catetos y nos devuelve la hipotenusa
	       public static double hipotenusa( double c1, double c2);
		   
	   - menor: le pasamos tres números enteros y devuelve el menor
	       public static int menor(int a, int b, int c );
	   
	   - sumaLetras: le pasamos dos cadenas de caracteres y devuelve  
	           cuántos caracteres tienen entre las dos cadenas.
		   public static int sumaLetras(String s1, String s2);	   
			   
			   
		  ¿Cómo usarlo?
		   int numChars = sumaLetras("Hola", "Adiós");
		   sumaLetras("Hola", "Adiós");  // error: no se recoge el valor
			   
	   - desviacionTipica: le pasamos un array de enteros y devuelve     
	        el valor de la desviación típica.
		   public static double  desviacionTipica(int[] numeros);
	   
   Ej. 3 
       Codificar el método llamado aleatorio que recibe un intervalo
	   de números (valores enteros) y genera un número entero en 
	   dicho intervalo.
	   Realizar un método llamado pruebaAleatorio que lleve
	   a cabo pruebas sobre el método anterior y nos informe
	   si se detecta un fallo.
	   
   Ej. 4
       Codificar y probar el método desviacionTipica del ejercicio 2.
	   ¿Podríamos sobrecargar este método? Prueba a hacer otro
	   método desviacionTipica que reciba un array de double.
*/