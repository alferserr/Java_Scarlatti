import java.util.Scanner;

public class Anidados4 {
  public static void main(String[] args) {
    // pregunta un n�mero n al usuario e imprime
	// un tri�ngulo con n filas
	// Ejemplo: n = 3
	//       *
	//      **
	//     ***
	Scanner lector = new Scanner(System.in);
	System.out.print("Introduce n: ");
	int n = lector.nextInt();
	
	for (int filas=1; filas<=n; filas++) {
	   for(int blancos=1; blancos <=(n-filas); blancos++) {
		   System.out.print(" ");
	   } 
	   for(int ast=1; ast<=filas; ast++) {
		   System.out.print("*");
	   } 
	   System.out.println();
	}
  
  
  }
}
