/* En este ejercicio probamos la sentencia super() parar
   llamar a métodos de la clase padre.
   Aplicable a métodos y constructores.
*/
abstract class Vehiculo {
	String marca;
	String modelo;
	String matricula;
	int velocidad = 0;
	int km=0;
	int plazas;
	String bastidor;
	
	// métodos: arrancar, parar, acelerar...
	// 
	public void arrancar() {
		System.out.println("Arrancando...");
	}
	
	public abstract void repostar();
	
	public void parar() {
		System.out.println("Parando...");
	}
	
	public void acelerar(int velocidad) {
		// hasta que se alcance nueva velocidad
		this.velocidad = velocidad;
	}
	
	/* sobrescribimos método toString */
	public String toString() {
		String info = "Matricula: " + matricula + " " +
		    "Marca: " + marca + " " +
		    "Modelo: " + modelo + " " +
			"Velocidad: " + velocidad;
			// y más cosas si queremos...
			
		return info;
	}
	
}

class Coche extends Vehiculo{ // hereda de Vehiculo

	// constructores 
	public Coche(String matricula) {
		this.matricula = matricula;
	}
	public void repostar() {
		System.out.println("Coche repostando");
	}


	
}

// clase Camion
// mismos atributos que coche  + carga máxima

class Camion extends Vehiculo{
	int cargaMax=0;
	boolean remolque = false;
	
	// constructores 
	public Camion(String matricula) {
		this.matricula = matricula;
	}
	// sobrescribimos el método arrancar
	public void arrancar() {
		System.out.println("Arrancando camión...");
	}
	public void repostar() {
		System.out.println("Camion repostando");
	}

}

// clase Autobus  ????? :(
// + atributo pasajeros (en cada momento)


class Autobus extends Vehiculo{

	int pasajeros=0;
	
	// constructores 
	public Autobus(String matricula) {
		this.matricula = matricula;
	}
	public void repostar() {
		System.out.println("Bus repostando");
	}

	// queremos que se imprima 'pasajeros'
	// redefinimos toString
	public String toString() {
		// Vamos a utilizar la instrucción super
		// Mira el antiguo código abajo.
		String info = super.toString() + " Pasajeros: " + 
		     pasajeros;
		/*
		String info = "Matricula: " + matricula + " " +
		    "Marca: " + marca + " " +
		    "Modelo: " + modelo + " " +
			"Velocidad: " + velocidad + " " +
			"Pasajeros: " + pasajeros;
		*/
			
		return info;
	}

}

	


public class TransporteHerenciaPlus2 {
	public static void main(String[] args) {
		Vehiculo c1 = new Coche("1234-JBH");
		c1.marca="Seat";
		c1.modelo="Ibiza";
		System.out.println(c1);
		c1.repostar();
		
		Camion cam1 = new Camion("4321-CBA");
		cam1.marca="Iveco";
		cam1.modelo="RoadKiller";
		cam1.cargaMax=6000; // kg
		Vehiculo cam2 = cam1;
		System.out.println(cam2);
		cam2.repostar();
		
		Autobus a1 = new Autobus("0001-JMR");
		a1.marca="Iveco";
		a1.modelo="SoftTrip";
		a1.pasajeros=20; // 
		System.out.println(a1);
		a1.repostar();
		
		/* // si Vehiculo es 'abstract'
		   // no podemos instanciarlo
		Vehiculo v1 = new Vehiculo();
		v1.arrancar();
		System.out.println(v1);
		*/
		
		Vehiculo[] flota = new Vehiculo[10];
		flota[0] = c1;
		flota[1] = cam1;
		flota[2] = a1;
		System.out.println("---Prueba Polimorfismo---");
		for(Vehiculo v: flota) {
			if (v!= null) {
				System.out.println(v);
				v.parar();
				v.repostar();
			}
		}
		
		
	}
		
}



