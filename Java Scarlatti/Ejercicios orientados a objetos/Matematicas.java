/* Diseñar una clase que contenga métodos para:
   - calcular del Máximo Común Divisor de 2 números
   - calcular el máximo de tres números
   ...
   
*/

public class Matematicas {
    public static  int mcd(int dividendo, int divisor) {
	   if (dividendo < divisor) {
		   int aux = dividendo;
		   dividendo = divisor;
		   divisor = aux;
	   }
	   int resto = dividendo%divisor;
	   while(resto != 0) {
		   dividendo = divisor;
		   divisor   = resto;
		   resto = dividendo%divisor;
	   }	   
	   return divisor;
   }
   
   // imprime tres números de menor a mayor
   // 7, 1, 4 -> imprime 1 4 7
   //  3  2  1  (a b c)
   //  2  3  1
   //  1  3  2
   //  1  2  3  (a b c al final)
   public static void imprime3Orden(int a, int b, int c) {
       if ( b < a) {
		   int aux = a;
		   a = b; 
		   b = aux;
       }		   
	   if (c < a) {
		   int aux = a;
		   a = c;
		   c = aux;
	   }
	   if (c < b) {
		   int aux = b;
		   b = c;
		   c = aux;
	   }
		   
	   System.out.println(a + " " + b + " " + c);
   }

}