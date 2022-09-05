import java.util.Scanner;
public class Ejercicio17 {
   
   public static void main (String[] args) {
	   final int LEN = 10;  
	   
	   Scanner reader = new Scanner(System.in);
	   int contPos = 0;
	   int contNeg = 0;
	   int contCeros = 0;
	   int sumaPos = 0;
	   int sumaNeg = 0;
	   
	   for(int i=0; i<LEN; i++) { 
		   System.out.print("Introduce número: ");
		   int num = reader.nextInt();
		   if (num > 0) { // positivo
			   contPos++;
			   sumaPos = sumaPos + num;
		   } else if (num < 0) { 
			   contNeg++;
			   sumaNeg = sumaNeg + num;
		   } else {
			   contCeros++;
		   }
	   }
	   if (contPos>0) {
		   System.out.println("Media + es:" + (float)sumaPos/contPos);
	   }
	   if (contNeg>0) {
		   System.out.println("Media - es:" + (float)sumaNeg/contNeg);
	   }
	   System.out.println("Ceros leídos: " + contCeros);
	   
   }
}

/* Ejercicio 1: 
     quitar comentario en línea:
	 //suma_dif = suma_dif + Math.pow...
	 y comprobar si funciona
	 
	 
*/