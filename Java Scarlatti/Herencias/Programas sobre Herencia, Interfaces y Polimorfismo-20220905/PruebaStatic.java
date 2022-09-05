import java.util.Scanner;
/* En este programa vamos a utilizar un atributo ESTATICO para contar cuántos objetos
   se crean de la clase Coordenada.
   Debemos distinguir entre los atributos estáticos, que pertenecen a la clase, no 
   a los objetos de la clase, y los no estáticos (propios de cada objeto que creemos).
   
   Como los atributos de la clase Coordenada son públicos, podemos cambiar su valor
   desde otras clases. En los ejercicios cambiaremos la forma de acceder a estos
   atributos (con métodos set y get). Esto nos da la posibilidad de "controlar" este
   acceso a los valores y nos permitiría, por ejemplo, establecer valores máximos de
   x o y para cada objeto.
   
   Un objeto Coordenada podría ser a su vez un atributo de otra clase. 
   Echa un vistazo a la clase Nave, cuya ubicación en un tablero o plano en 2D
   se define según el valor de la Coordenada que contiene.
   
   
*/


class Coordenada {
   public double x;
   public double y;
   
   public static int objetosCreados = 0;  // contador (es único para todos)
   
   public int otroContador = 0;  // es propia de cada objeto (cada objeto tiene una)
   
   // Ctor.
   Coordenada(double x, double y) {
      this.x = x;  // el atributo x toma el valor del parámetro x
	  this.y = y;
	  objetosCreados++;   // ¿Por qué no Coordenada.objetosCreados++  ?  Porque estamos dentro de la clase Coordenada
	  otroContador++;     // realmente no muy útil: no nos sirve para contar objetos creados
   }
   
   Coordenada() {
      // x = 0.0;  // realmente no necesario...
	  // y = 0.0;  
	  objetosCreados++; 
	  otroContador++;
   }
   
   // métodos
     // devuelve la distancia al origen del objeto (NO es un método estático)
   public double distanciaOrigen() {
	  double dist = Math.sqrt( x*x + y*y );
	  return dist;
   }
   
   public String toString() {
	   // ejercicio: hacer que imprima las coordenadas
	   String c = "x: " + x + " y: " + y;
	   return c;
   }
   

}


class Nave {  // de juego en 2D
   // atributos
   Coordenada pos;  // Este atributo es una referencia a una Coordenada (tendrá que referenciar a un objeto de esa clase)
                    // El objeto Coordenada se podría pasar al constructor de Nave, o crearlo después...   
   float nivelCombustible;
   
   // etc...

}

class PruebaStatic {
  
  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
	
	// Creamos objetos Coordenada
	
    Coordenada c1 = new Coordenada(1,1);
	//  Coordenada.objetosCreados++; -> mejor ponerlo en el ctor...
	Coordenada c2 = new Coordenada(3,4);
	Coordenada c3 = new Coordenada();
	Coordenada c4 = new Coordenada(2.5,3.5);
	
	// Guardamos los objetos en un array
	Coordenada[] array = new Coordenada[10];
	array[0] = c1;
	array[1] = c2;	
	array[2] = c3;	
	array[3] = c4;

    // imprimir distancias al origen
	int i = 0;
	while(array[i] != null) {
		System.out.println(array[i] + " Distancia al origen: " + array[i].distanciaOrigen() );
		i++;
	}
	
	// c2.setY(0);
	// Coordenada.objetosCreados++;   // podemos modificarlo porque es público
	
	System.out.println("Se han creado " + Coordenada.objetosCreados + " objetos ");
	
	System.out.println("Se han creado " + c4.otroContador + " objetos ");
  }
}
	
/* 
   Ejercicio 1: codificar y probar el metodo toString de Coordenada (ya resuelto)
   
   Ejercicio 2: cambiar los valores de las coordenadas de c1 y c2 antes y después
      de almacenar la coordenada en el array. 
	  Hacer pruebas mostrando los objetos de arrays.
	  
	  ¡Ojo! C2 y array[1] SON el MISMO objeto...
	  
   Ejercicio 3: haz pruebas llamando al método distanciaOrigen sobre c3 y c4.
   
   Ejercicio 4: hacer métodos set y get para las coordenadas x e y, que ahora serán
      atributos privados. ¿Qué ventajas podría ofrecernos hacerlo así?
	  
   Ejercicio 5: lo mismo que el anterior, pero para acceder con un método a objetosCreados
   (que pasa a ser privada). En este caso, hacer solo un método get(). NO se puede
   cambiar el valor de objetosCreados desde fuera.
   
   
   
*/
   
	