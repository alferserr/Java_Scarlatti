import java.util.Scanner;
public class Ejercicio18_detecta_negativos {
   
   public static void main (String[] args) {
	   final int LEN = 10;  
	   
	   Scanner reader = new Scanner(System.in);
	   boolean hayNegativo = false;
	   for(int i=0; i<LEN; i++) { 
		   System.out.print("Introduce número: ");
		   int num = reader.nextInt();
		   if (num < 0) {
			   hayNegativo = true;
		   }  
	   }
	   if (hayNegativo==true) {
		   System.out.println("Has introducido algún negativo");
	   } else {
		   System.out.println("No has introducido ningún negativo");
	   }
	   
   }
}

/* Ejercicio 1: 
     quitar comentario en línea:
	 //suma_dif = suma_dif + Math.pow...
	 y comprobar si funciona
	 
	 
*/