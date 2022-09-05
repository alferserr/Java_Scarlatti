import java.util.Scanner;

public class Anidados3 {
  public static void main(String[] args) {
    // pregunta un número n al usuario e imprime
	// un triángulo con n filas
	// Ejemplo: n = 3
	//    ***
	//    **
	//    *
	Scanner lector = new Scanner(System.in);
	System.out.print("Introduce n: ");
	int n = lector.nextInt();
	
	for (int filas=n; filas>=1; filas--) {
	   for(int ast=1; ast<=filas; ast++) {
		   System.out.print("*");
	   } 
	   System.out.println();
	}
  
  
  for (int filas=1; filas<=n; filas++) {
	   for(int ast=n; ast>=filas; ast--) {
		   System.out.print("*");
	   } 
	   System.out.println();
	}
  }
}
