import java.util.Scanner;
/* ORDENA3
Escribe un programa que pida tres n�meros
al usuario y los escriba ordenados de menor a mayor.*/
public class Ordena3 {
  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    int a = 0;
	int b = 0;
	int c = 0;
	
    System.out.print("Introduce el primer n�mero: ");
    a = lector.nextInt();

    System.out.print("Introduce el segundo n�mero: ");
    b = lector.nextInt();

    System.out.print("Introduce el tercer n�mero: ");
    c = lector.nextInt();	

	
    // Output input by user
    System.out.println("N�meros: " + a + " " + b + " " + c);
	System.out.println();

  }
}
/*
32

1	2	3	4	5	6	7	8	9	10
11	12	13	14	15
*/