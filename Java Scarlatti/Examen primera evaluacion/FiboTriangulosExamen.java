import java.util.Scanner;

/**
 4. La serie de Fibonacci: 0,1,1,2,3,5,8,13... se genera a partir de los valores iniciales 0 y 1. El siguiente 
término es la suma de estos y, como se observa, cada término es siempre la suma de los dos anteriores. 
Necesitamos un método estático que reciba un número n y nos devuelva el término n-ésimo de la serie: static int nFibo (int n){} 
Por ejemplo, si llamamos al método pasándole el valor 7, nos devuelve el séptimo término de la serie (el 8 
). Codifica el método nFibo (solo el método, sin incluirlo en ninguna clase). (1’5 puntos)

3. Codifica el método (sin incluirlo en ninguna clase): (1’5 puntos)
public static void printNumbers(int filas) {}
que recibe un número entero e imprime por pantalla una cuenta atrás como la siguiente (para filas = 4)
4321
321
21
1
 
 */
public class FiboTriangulosExamen
 {
    // método main: solo para probar los métodos. NO se pedía en el examen.
    public static void main(String[] args) {
        
		System.out.println( nFibo(7) );
		System.out.println( nFibo(2) );
		System.out.println( nFibo(0) );
		
		printNumbers(7);
		printNumbers(4);
	}
	
	public static void printNumbers(int filas) {
		for(int i=filas; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static int nFibo (int n){
		int n1=0;
		int n2=1;
		int resul = 0;
		// utilizamos un switch-case en lugar de if-else (por practicar... son equivalentes)
		switch(n) {
			case 1: resul = n1;
				break;
			case 2: resul = n2;
				break;
			default:
			    int j=2;  // los dos primeros términos no se calculan (0 y 1)
			    while(j<n) {
					resul = n2+n1;
					n1=n2;
					n2=resul;
					j++;					
				}
		}
		
		return resul;
		 
			
	}
}