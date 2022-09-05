/*
  Enunciado:
    Codificar la clase Persona, con atributos privados y
	métodos set, get e imprimeDatos públicos.
	Codifica al menos un constructor que reciba el DNI
	de la persona.
	
	Crea más objetos en PruebaPersona e imprime sus datos.


*/
class Persona {
	
	// atributos (deben ser privados)
	private String DNI;
	// constructor (solo uno: que reciba el DNI)
	public Persona(String dni) {
		DNI = dni;
	}
	// métodos (públicos: acceso desde fuera)
	//   Restricción: el DNI sólo puede leerse (get), NO modificar
	
	
}
	
	
public class PruebaPersona {

   public static void main(String args[]) {
	  String dni = "12342345G";
      Persona person = new Persona(dni);
	  // o directamente: 
	  //Persona person = new Persona("12342345G");
	  person.setNombre("Luis Alba");
	  person.setEdad(25);
	  person.imprimeDatos(); // imprime por pantalla todos los datos
							 //   del objeto person
   }
}