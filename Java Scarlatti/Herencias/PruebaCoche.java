
public class PruebaCoche {

    public static void main(String[] args) {
	    Coche coche1 = new Coche("AD1234", "Opel", "Otilla");
		coche1.nuevo=true;
		coche1.km=0;
		coche1.setModelo("Corsa");
		coche1.imprimeDatosCoche();
		Coche coche2 = new Coche("AD1235", "Opel", "Otilla");
		System.out.println("Coches creados: " + Coche.contador);
	}
}