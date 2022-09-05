import java.util.Scanner;

public class Anidados2 {
  public static void main(String[] args) {
    // pregunta un número n al usuario e imprime
	// un triángulo con n filas
	// Ejemplo: n = 3
	//    *
	//    **
	//    ***
	Scanner lector = new Scanner(System.in);
	System.out.print("Introduce n: ");
	int n = lector.nextInt();
	
	for (int filas=1; filas<=n; filas++) {
	   for(int ast=1; ast<=filas; ast++) {
		   System.out.print("*");
	   } 
	   System.out.println();
	}
  }
  
  
}
