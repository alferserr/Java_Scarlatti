/*
EJERCICIO: 

Crear una lista con al menos 10 coordenadas, 
mostrarlas utilizando un iterador y eliminar
(utilizando el método remove() del Iterator) aquellas coordenadas
que estén a una distancia del origen menor que 1.

*/
import java.io.*; 
import java.util.*; 

class Coordenada implements Comparable<Coordenada>{
	public double x;
	public double y;
	
	public Coordenada(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distanciaAlOrigen() {
		return Math.sqrt(x*x + y*y);
	}
	
	@Override
	public int compareTo(Coordenada c) {
		return (int) ( (x*x + y*y) - ((c.x * c.x) + (c.y * c.y)) );
	}
	
	@Override
	public String toString() {
		String resul = String.format("x: %5.2f  y: %5.2f  Dist: %5.2f %n", x, y, distanciaAlOrigen() );
		return resul;
	}
}

public class PruebaIteradorCoordenada
{ 
	public static void main(String[] args) 
					
	{ 
	    		
		List<Coordenada> lista = new ArrayList<Coordenada>();
		
		Coordenada c1 = new Coordenada(2.0, 2.0);
		Coordenada c2 = new Coordenada(2.0, -2.0);
		Coordenada c3 = new Coordenada(3.0, 3.0);
		Coordenada c4 = new Coordenada(0.0, 1.0);
		Coordenada c5 = new Coordenada(-0.01, 0.2);
		Coordenada c6 = new Coordenada(2.0, -2.0);
		Coordenada c7 = new Coordenada(6.0, -3.0);
		Coordenada c8 = new Coordenada(0.0, 0.9);
		Coordenada c9 = new Coordenada(1.0, 1.0);
		Coordenada c10 = new Coordenada(0.4, -0.4);
		
		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);
		lista.add(c6);
		lista.add(c7);
		lista.add(c8);		
		lista.add(c9);
		lista.add(c10);

		Iterator<Coordenada> iter = lista.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		iter = lista.iterator();  // solicitamos un NUEVO iterador.
		
		 while(iter.hasNext()) {
			Coordenada c = iter.next();
			if (c.distanciaAlOrigen() < 1.0) {
				iter.remove();   // eliminamos de la lista última coordenada visitada
			}
		}
		
		System.out.println("\nLista tras eliminar elementos: ");
		// una vez más: NUEVO iterador...
		iter = lista.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	} 
} 


/* 
   CUESTIÓN: 
     Cada vez que queremos recorrer la lista estamos creando un nuevo iterador llamando al método
	 iterator().
	 ¿Existe algún método de reutilizar un iterador? ¿Un método reset o algo así que haga que el iterador vuelva
	 al comienzo?
	 
	EJERCICIO:
	  ¿Podrías realizar un método que te cree y devuelva una coordenada con valores absolutos aleatorios 
	   de x e y menores que 2?
	  Utilízalo en este programa para rellenar en un bucle las diez coordenadas.
   
 */