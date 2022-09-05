import java.util.Scanner;
public class PrimerArray {
   
   public static void main (String[] args) {
	   int[] numeros = new int[5];
	   Scanner reader = new Scanner(System.in);
	   
	   for(int i=0; i<5; i++) { // rellenamos array
		   System.out.print("Introduce num: ");
		   int num = reader.nextInt();
		   numeros[i] = num;
	   }
	   for (int j=4; j>=0 ; j--) { // recorrer desde el final
	       System.out.println("Posición " + j + ": " + numeros[j]); 
	   }
	   System.out.println("El tamaño del array es: " + numeros.length);
	   prueba();
	   int doblado = doble(10);
	   System.out.println("Valor doble: " + doblado);
   }

   public static void prueba() {
	   System.out.println("Esto es una prueba");
   }
   public static int  doble(int num) {
	   int resul = num*2;
	   return resul;  // en Logo: output resul
   }
}