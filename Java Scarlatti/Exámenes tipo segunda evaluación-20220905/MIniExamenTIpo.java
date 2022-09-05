
import java.util.Scanner;
import java.util.Arrays;

/*
Codifica un programa que lea calificaciones de exámenes
hasta que el usuario introduzca un cero. 
Las calificaciones contempladas serán valores 
enteros de 1 a 10. 
Tras terminar el programa imprimirá las siguientes
 estadísticas: valor medio, valor máximo y frecuencia de cada calificación (es decir, cuántas calificaciones igual a 1 ha habido, igual a 2… etc.)


*/

public class MiniExamenTipo {


  public static void main(String[] args) {
   Scanner rd = new Scanner(System.in);
   /* Ejercicio 6 */
   System.out.print("Introduce una frase: ");
   String frase1 = rd.nextLine();  
   System.out.print("Introduce otra frase: ");
   String frase2 = rd.nextLine();
   
   String frase11 = frase1.toLowerCase(); 
   String frase22 = frase2.toLowerCase(); 
   
   if(frase11.contains(frase22)) {
	   System.out.println("\"" + frase1 + "\" contiene " + 
	                    "\"" + frase2 + "\"");
   }
   if(frase22.contains(frase11)) {
	   System.out.println("\"" + frase2 + "\" contiene " + 
	                    "\"" + frase1 + "\"");
   }
   
   /* Ejercicio 5 */
   System.out.print("Introduce frase: ");
   String frase = rd.nextLine();
   for(int i=frase.length()-1;i>=0; i--) {
	   char c = frase.charAt(i);
	   if( c !=' ' ) {// ojo: comillas simples...
	       System.out.print(c);
	   }
   }
   System.out.println();
   
   /* Ejercicio 4 */
   int[] frec = new int[11];

   int leidos = 0; 
   int suma = 0;
   System.out.print("Introduce nota: (1-10): ");
   int nota = rd.nextInt();
   int max = nota;
   while(nota != 0) {
	 if (nota >=1 && nota <=10) {
	    frec[nota]++;
		leidos++;
	    //
	 }
	 System.out.println("Introduce nota: (1-10): ");
     nota = rd.nextInt();   
   }
 
   for(int j=1; j<=10; j++) {
	   System.out.println("Nota = " + j + " Frec: " + frec[j]);
   }
    
 }
}




