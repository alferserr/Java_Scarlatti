public class ArgumentosConsola {
  public static void myMethod(String str) {
    System.out.println("I just got executed! " + str);
  }

  public static void main(String[] args) {
    System.out.println(args[0]);
    myMethod("Hola");
    myMethod("Esto es una prueba");
	String despedida = "Adi�s";
    myMethod(despedida);
	
	int nota = redondeaNota(7.5d);
	System.out.println(nota);
	
	nota = redondeaNota(7.1d);
	System.out.println(nota);
	
	nota = redondeaNota(4.5d);
	System.out.println(nota);
  }
  
  public static int redondeaNota(double nota) {
	  // nuestro c�digo... ver Math.round();
	  int resul = (int) Math.round(nota); // round est� sobrecargado!!
	  return resul; // int
  }
}

/* Ej. 1
       Codificar el m�todo redondeaNota que recibe una nota
	   con decimales y devuelve el valor entero m�s cercano,
	   excepto para los valores comprendidos entre 4.0 y 5, que
	   ser� 4.
	   
   Ej. 2 
       Codificar el m�todo aleatorio que recibe un intervalo
	   de n�meros (valores enteros) y genera un n�mero en 
	   dicho intervalo.
	   
*/