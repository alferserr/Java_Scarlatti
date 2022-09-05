import java.util.Scanner;

public class PruebaEntero {

   public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		Entero a = new Entero();
		Entero b = new Entero(10);
		
		System.out.println("objeto a: " + a.num);
		System.out.println("objeto b: " + b.num);
		if (b.esPar()) {
			System.out.println(b.num + " es par");
		} else {
			System.out.println(b.num + " NO es par");
		}
		
		a.num = 7;
		a.duplicar();
		System.out.println(a.num);
		System.out.println(b.esImpar());
		
		a.suma(b);  // al objeto a le suma el b
		a.suma(a);  // se suma a sí mismo
		a.suma(2);  // le sumamos un 2
		
		//a = a + b;  // NO se puede
		// operadores aritméticos: solo para tipos
		//   básicos
		
		System.out.println(a.num);
		
		
		Entero c = b;  // apuntamos al mismo objeto que b
		System.out.println(c.num);
		
		b = a;   // b apunta ahora al mismo objeto que ahora
		a.num = 28;
		
	    if (b.esPar()) {
			System.out.println(b.num + " es par");
		} else {
			System.out.println(b.num + " NO es par");
		}
		
		// tenemos tres referencias... pero solo 2 objetos
		System.out.println("objeto a: " + a);
		System.out.println("objeto b: " + b);
		System.out.println("objeto c: " + c);
		
		
		
		
   }
}