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
	  // nuestro c�digo... ver Math.round();
	  // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html
	  int resul;
	  if !(nota>=4.0 && nota < 5.0) {
		  resul = (int) Math.round(nota); // round est� sobrecargado!!
	  } else {
		  resul = 4;
	  }
	  
	  // otra forma: if (nota<4.0 || nota >=5) ... operador OR 
	  return resul; // int
  }
}

/* Ej. 1
       Codificar el m�todo redondeaNota que recibe una nota
	   con decimales y devuelve el valor entero m�s cercano,
	   excepto para los valores comprendidos entre 4.0 y 5, que
	   ser� 4.
   Ej. 2
       Escribir la declaraci�n (primera l�nea) de los siguientes 
	   m�todos:
	   - hipotenusa: le pasamos los catetos y nos devuelve la hipotenusa
	       public static double hipotenusa( double c1, double c2);
		   
	   - menor: le pasamos tres n�meros enteros y devuelve el menor
	       public static int menor(int a, int b, int c );
	   
	   - sumaLetras: le pasamos dos cadenas de caracteres y devuelve  
	           cu�ntos caracteres tienen entre las dos cadenas.
		   public static int sumaLetras(String s1, String s2);	   
			   
			   
		  �C�mo usarlo?
		   int numChars = sumaLetras("Hola", "Adi�s");
		   sumaLetras("Hola", "Adi�s");  // error: no se recoge el valor
			   
	   - desviacionTipica: le pasamos un array de enteros y devuelve     
	        el valor de la desviaci�n t�pica.
		   public static double  desviacionTipica(int[] numeros);
	   
   Ej. 3 
       Codificar el m�todo llamado aleatorio que recibe un intervalo
	   de n�meros (valores enteros) y genera un n�mero entero en 
	   dicho intervalo.
	   Realizar un m�todo llamado pruebaAleatorio que lleve
	   a cabo pruebas sobre el m�todo anterior y nos informe
	   si se detecta un fallo.
	   
   Ej. 4
       Codificar y probar el m�todo desviacionTipica del ejercicio 2.
	   �Podr�amos sobrecargar este m�todo? Prueba a hacer otro
	   m�todo desviacionTipica que reciba un array de double.
*/