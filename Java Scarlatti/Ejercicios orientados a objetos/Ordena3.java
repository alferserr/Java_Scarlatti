import java.util.Scanner;
/* ORDENA3
Escribe un programa que pida tres números
al usuario y los escriba ordenados de menor a mayor.*/
public class Ordena3 {
  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    int a = 0;
	int b = 0;
	int c = 0;
	
    System.out.print("Introduce el primer número: ");
    a = lector.nextInt();

    System.out.print("Introduce el segundo número: ");
    b = lector.nextInt();

    System.out.print("Introduce el tercer número: ");
    c = lector.nextInt();	

	
    // Output input by user
    System.out.println("Números: " + a + " " + b + " " + c);
	System.out.println();

  }
}
/*
32

1	2	3	4	5	6	7	8	9	10
11	12	13	14	15
*/