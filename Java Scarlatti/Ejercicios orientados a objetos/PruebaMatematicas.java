

public class PruebaMatematicas {

   public static void main(String[] args) {
	   int x = 45;
	   int y = 120;
	   int maxComDivisor = Matematicas.mcd(x,y);
	   System.out.println("El MCD de " + x + " y " + y + " es : " +
	        maxComDivisor);
    
       Matematicas.imprime3Orden(7,4, 1);
   }


}

