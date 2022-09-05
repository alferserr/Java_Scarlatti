public class ArgumentosConsola {
  public static void myMethod(String str) {
    System.out.println("I just got executed! " + str);
  }

  public static void main(String[] args) {
    System.out.println(args[0]);
    myMethod("Hola");
    myMethod("Esto es una prueba");
	String despedida = "Adiós";
    myMethod(despedida);
	
	int nota = redondeaNota(7.5d);
	System.out.println(nota);
	
	nota = redondeaNota(7.1d);
	System.out.println(nota);
	
	nota = redondeaNota(4.5d);
	System.out.println(nota);
  }
  
  public static int redondeaNota(double nota) {
	  // nuestro código... ver Math.round();
	  int resul = (int) Math.round(nota); // round está sobrecargado!!
	  return resul; // int
  }
}

/* Ej. 1
       Codificar el método redondeaNota que recibe una nota
	   con decimales y devuelve el valor entero más cercano,
	   excepto para los valores comprendidos entre 4.0 y 5, que
	   será 4.
	   
   Ej. 2 
       Codificar el método aleatorio que recibe un intervalo
	   de números (valores enteros) y genera un número en 
	   dicho intervalo.
	   
*/