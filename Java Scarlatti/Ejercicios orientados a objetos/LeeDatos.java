import java.util.Scanner;
/* �rbol */
public class LeeDatos {
  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);

    System.out.println("Introduce un n�mero para calcular el factorial: ");

    // Numerical input
    //int num = lector.nextInt();
    float num = lector.nextFloat();
	
    // Output input by user
    System.out.println("N�mero: " + num);

  }
}