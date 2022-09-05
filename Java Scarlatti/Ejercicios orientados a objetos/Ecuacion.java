import java.util.Scanner;

public class Ecuacion {
  public static void main(String[] args) {
    /*  a*x^2 + b*x + c = 0
	    x = (-b +- sqrt(b^2 - 4ac)) / 2a
	*/
	Scanner reader = new Scanner(System.in); /*¡memorizar! */
	
    System.out.print("Coeficiente a: ");
	double a = reader.nextDouble();
	
	System.out.print("Coeficiente b: ");
	double b = reader.nextDouble();
	
	System.out.print("Coeficiente c: ");
	double c = reader.nextDouble();
	
	// calculamos el radicando
	double radicando = b*b - 4*a*c;
	if (radicando > 0) {
		double resul1 = (-1*b + Math.sqrt(radicando))/(2*a);
		double resul2 = (-1*b - Math.sqrt(radicando))/(2*a);
		System.out.println("Resultados: " + resul1 + " y " + resul2);
	} else if (radicando == 0) {
		double resul1 = (-1*b)/(2*a);
		System.out.println("Resultado: " + resul1);
	} else {
		System.out.println("La ecuación no puede resolverse.");
	}
	
  }
  
  
}
