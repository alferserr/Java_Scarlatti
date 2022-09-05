import java.util.Scanner;

/*
  Un par de ejercicios "para pensar".
  Van las soluciones...

 */
public class RotoCompactor {


/*   Codifica un m�todo denominado "compactor" que reciba una array de String que puede
contener referencias a null, y ponga dichos null al final del array.
Ejemplo: 
Dado un array:
String[] palabras = {"Hola", "Buen d�a", null, "Adios", null, "Bye"};
public static void compactor(String[] array) {
	// este m�todo "compacta" el array poniendo los elementos null
	// al final
}
tras ejecutar el m�todo el array palabras quedar�:
palabras = {"Hola", "Buen d�a", "Adios", "Bye", null, null};

Codifica tambi�n un m�todo (imprimeStrings(String[] array) ) que imprima los valores del array

*/
    public static void compactor(String[] array) {
		int index=0;
		int copia=0;
		while(index<array.length) {
			if(array[index]==null) {
				index++;
			} 
			else if(index==copia) { 
			   // se quedan igual y avanzamos
			   index++;
			   copia++;
			}
			else {
				array[copia] = array[index];
				array[index] = null;
				index++;
				copia++;
			}
		}
	}
	
	public static void imprimeStrings(String[] array) {
		for(String s: array) {
			if(s!=null) {
				System.out.print(s);
			}
			else {
				System.out.print("null"); 
			}
			System.out.print(" | "); // separador de Strings
		}
		System.out.println();
	}
	
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
		// probar compactor
		String[] palabras = {null, "Hola", "Buen d�a", null, "Adios", null, "Bye"};
		imprimeStrings(palabras);
		compactor(palabras);
		imprimeStrings(palabras);
		
		// probar los dos m�todos para rotar a la derecha
	    int[]  n = {1, 2, 3, 4};
		rotarDerecha(n,2);
        imprime(n);
		rotarDerecha2(n,2);
        imprime(n);		
		rotarDerecha(n,3);
        imprime(n);
		rotarDerecha2(n,3);
        imprime(n);
;
    }
	public static void imprime(int[] array) {
		for(int i:array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	/* 
	Codifica el m�todo rotarDerecha(int[] array, int posiciones) 
	que desplaza el contenido del array a la derecha seg�n el 
	n�mero de posiciones especificado.
	Ejemplo:
	int[]  n = {1, 2, 3, 4};   rotarDerecha(n, 2);
	El contenido ahora es: 3, 4,1,2
	Realiza c�digo para probarlo.
	*/
	
	public static void rotarDerecha(int[] array, int posiciones) {

		int last = array.length-1;	
		
		posiciones = posiciones%array.length;  // �Qu� consigue esta l�nea? (no es imprescindible, pero...)
		for(int j=0; j<posiciones; j++) {  // rotamos "posiciones" veces
			// el siguiente c�digo provoca UNA rotaci�n a la derecha de los elementos del array
			int aux = array[last];
			for(int i=last; i>0; i--) {
				array[i]=array[i-1];
			}
			array[0]=aux;
		}
		
	}
	
	// esta soluci�n utiliza una copia del array para "mover" los elementos
	public static void rotarDerecha2(int[] array, int posiciones) {

		int len = array.length;	
		int[] copia = new int[len];
		
		for(int i=0; i<len; i++) { 
            copia[(i+posiciones)%len] = array[i];
		}
		// ahora volcamos la copia en el array que nos han pasado
		for(int i=0; i<len; i++) {
			array[i]=copia[i];
		}
		
	}
    
}