

class Coche {
	// atributos
	// marca, modelo, matrícula, km, plazas
	String marca;
	String modelo;
	String matricula;
	int velocidad = 0;
	int km=0;
	int plazas;
	
	// constructores 
	public Coche(String matricula) {
		this.matricula = matricula;
	}
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

// clase Camion
// mismos atributos que coche  + carga máxima

class Camion {
	// atributos
	// marca, modelo, matrícula, km, plazas
	String marca;
	String modelo;
	String matricula;
	int velocidad = 0;
	int km=0;
	int plazas;
	int cargaMax=0;
	
	// constructores 
	public Camion(String matricula) {
		this.matricula = matricula;
	}
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

// clase Autobus  ????? :(
// + atributo pasajeros (en cada momento)


class Autobus {
	// atributos
	// marca, modelo, matrícula, km, plazas
	String marca;
	String modelo;
	String matricula;
	int velocidad = 0;
	int km=0;
	int plazas;
	int pasajeros=0;
	
	// constructores 
	public Autobus(String matricula) {
		this.matricula = matricula;
	}
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

	


public class Transporte {
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



