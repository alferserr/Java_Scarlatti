
/* Realiza un programa que sume los 20 primeros números 
   naturales (1, 2, ...20)  y muestre el resultado 
   por pantalla.
*/
public class Ejercicio8 {
  public static void main(String[] args) {
    
	int suma = 0;
	for(int i=1; i<=20; i++) {
		//System.out.println(i);
		suma = suma + i;  // suma += i;
	}
	int j = 1;
	int suma2 = 0;
	while(j<=20) {
		suma2 += j;
		j++;
	}
    System.out.println("La suma es: " + suma);
	System.out.println("La suma es: " + suma2);
	
  }
  
}

