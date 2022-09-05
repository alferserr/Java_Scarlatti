
class Vehiculo {
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
	
	public void parar() {
		System.out.println("Parando...");
	}
	
	public void acelerar(int velocidad) {
		// hasta que se alcance nueva velocidad
		this.velocidad = velocidad;
	}
	
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
}

// clase Autobus  ????? :(
// + atributo pasajeros (en cada momento)


class Autobus extends Vehiculo{

	int pasajeros=0;
	
	// constructores 
	public Autobus(String matricula) {
		this.matricula = matricula;
	}
	
	// queremos que se imprima 'pasajeros'
	// redefinimos toString
	public String toString() {
		String info = "Matricula: " + matricula + " " +
		    "Marca: " + marca + " " +
		    "Modelo: " + modelo + " " +
			"Velocidad: " + velocidad + " " +
			"Pasajeros: " + pasajeros;
			
			
		return info;
	}

}

	


public class TransporteHerencia {
	public static void main(String[] args) {
		Coche c1 = new Coche("1234-JBH");
		c1.marca="Seat";
		c1.modelo="Ibiza";
		System.out.println(c1);
		
		Camion cam1 = new Camion("4321-CBA");
		cam1.marca="Iveco";
		cam1.modelo="RoadKiller";
		cam1.cargaMax=6000; // kg
		System.out.println(cam1);
		
		Autobus a1 = new Autobus("0001-JMR");
		a1.marca="Iveco";
		a1.modelo="SoftTrip";
		a1.pasajeros=20; // 
		System.out.println(a1);
		
	}
		
}



