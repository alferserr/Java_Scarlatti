/*
Triángulo Números

Codifica un programa que genere un "triángulo" como el de la figura.
1
12
123
1234
12345
123456
1234567
12345678
123456789

Variante: genera aleatoriamente el nÃºmero de filas (entre 1 y 9).
*/

public class TrianguloNumeros {
   public static void main(String[] args) {
     int filas = 5;
     for(int i=1; i<=filas; i++) {
		 for(int j=1; j<=i; j++) {
			 System.out.print(j);
		 }
		 System.out.println();
	 }		 
   }
}