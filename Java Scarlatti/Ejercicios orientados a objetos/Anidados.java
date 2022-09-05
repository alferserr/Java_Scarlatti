import java.util.Scanner;

public class Anidados {
  public static void main(String[] args) {
    // pregunta un número n al usuario e imprime
	// un cuadrado con n*n asteriscos
	// Ejemplo: n = 2
	//    **
	//    **
	Scanner lector = new Scanner(System.in);
	System.out.print("Introduce n: ");
	int n = lector.nextInt();
	
	for (int filas=0; filas<n; filas++) {
	   for(int ast=0; ast<n; ast++) {
		   System.out.print("*");
	   } 
	   System.out.println();
	}
  }
  
  
}
