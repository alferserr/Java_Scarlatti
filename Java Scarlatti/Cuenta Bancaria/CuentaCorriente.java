/* EJERCICIO:
   Clase (provisional) para probar el cálculo del dígito de control de una cuenta bancaria.
   

*/
import java.util.Scanner;

public class CuentaCorriente{
	public static void main(String[]args){
		
		Scanner lector = new Scanner(System.in);
		
		/* Probar el método digitoN ->
		long numero = 7654321;
		System.out.println( digitoN(numero, 1) );
		System.out.println( digitoN(numero, 2) );
		System.out.println( digitoN(numero, 7) );
		System.out.println( digitoN(numero,10) ); */
		
		System.out.println("Calcular digito de control C.Corriente");
		
		System.out.print("Introduzca entidad (cuatro digitos): ");
		long entidad = lector.nextLong();
		System.out.print("Introduzca oficina (cuatro digitos): ");	
		long oficina = lector.nextLong();
		System.out.print("Introduzca numero cuenta (diez digitos): ");
        long cuenta = lector.nextLong();	
        
		System.out.println("El D.C. calculado es: " +
		                       digitoControl(entidad, oficina, cuenta) );
		
	}
	
	
	/*
	  Este método extrae el dígito especificado (0..9) de un long.
	  La posición, parámetro pos, empieza en 1 para el dígito menos significativo:
	  Ejemplo: para el número   7654321 la posición 2 contiene un 2.
	*/
	public static long digitoN (long num, int pos){	
		while(pos>1) {
			num = num/10;
			pos--;
		}
		return num%10;	
	}
	
	/* calcula el dígito de control de una cuenta. Los tipos "long" están "sobredimensionados" */
	public static long digitoControl(long entidad, long sucursal, long cuenta) {
		// cálculo primer dígito
		long r1 = digitoN(entidad, 4) * 4 +
				  digitoN(entidad, 3) * 8 +
				  digitoN(entidad, 2) * 5 +
				  digitoN(entidad, 1) * 10 +
				  digitoN(sucursal, 4) * 9 +
				  digitoN(sucursal, 3) * 7 +
				  digitoN(sucursal, 2) * 3 +
				  digitoN(sucursal, 1) * 6 ;
		long digito1 = 11 - r1%11;
		if (digito1 == 10) {
			digito1 = 1;
		} else if (digito1 == 11) {
			digito1 = 0;
		}
		// cálculo segundo dígito
		long r2 = digitoN(cuenta,10) * 1 +
                  digitoN(cuenta,9)  * 2 +
				  digitoN(cuenta,8)  * 4 +
				  digitoN(cuenta,7)  * 8 +
				  digitoN(cuenta,6)  * 5 +
				  digitoN(cuenta,5)  * 10 +
				  digitoN(cuenta,4)  * 9 +
				  digitoN(cuenta,3)  * 7 +
				  digitoN(cuenta,2)  * 3 +
				  digitoN(cuenta,1)  * 6;
		long digito2 = 11 - r2%11;
		if (digito2 == 10) {
			digito2 = 1;
		} else if (digito2 == 11) {
			digito2 = 0;
		}
		return digito1*10 + digito2;
	}	
}

/* EJERCICIOS PROPUESTOS: 
1. Realiza un método privado con la lógica del cálculo final de cada dígito de control, que es igual en ambos casos,
para simplificar el método digitoControl.

2. Otra forma de programar el cálculo del dígito de control podría basarse en tener almacenados los coeficientes
multiplicadores en un array y tomarlos de ahí.
Por ejemplo:
int[] coeficientesEntidad = {0,10,1,8,4};  // en la posición 0 colocamos un cero

Realiza un método digitoControl2 que utilice coeficientes almacenados en arrays y compara el código con el anterior.
¿Cuál crees que es mejor?

3. ¿Cómo sería una solución orientada a objetos? Crea la clase CuentaCorriente2 con un constructor al menos y los métodos
necesarios para calcular el dígito de control.

*/