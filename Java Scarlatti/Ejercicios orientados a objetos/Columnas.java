import java.util.Scanner;
/* Programa que imprime desde 1 hasta un número proporcionado
   por el usuario a diez columnas */
public class Columnas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	// pedir número al usuario
	System.out.print("Introduce límite: ");
	int limite = sc.nextInt();
	System.out.print("Introduce columnas: ");
	int columnas = sc.nextInt();
	
	for(int i=1; i<=limite; i++) {
		System.out.print(i + "  ");
		if ( i%columnas == 0 ) {
			System.out.println();
		}
	}
  }
  
  
}
/*
32

1	2	3	4	5	6	7	8	9	10
11	12	13	14	15
*/