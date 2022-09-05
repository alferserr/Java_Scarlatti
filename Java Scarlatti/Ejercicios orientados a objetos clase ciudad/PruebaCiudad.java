class Ciudad {
   // atributos
   String nombre;
   boolean defendida;
   //String estado; otra posibilidad
   int numCaballeros;
   int numOrcos;
   
   // Constructores (inicializan cada objeto creado)
   public Ciudad(String nombre) {
	   this.nombre = nombre;
	   defendida = true;
	   numCaballeros = 0;
	   numOrcos = 0;
   }
   public Ciudad(String nombre, int numCaballeros, int numOrcos) {
	   this.nombre = nombre;
       this.numCaballeros = numCaballeros;
       this.numOrcos = numOrcos;
       defendida = true;	   
   }
   
   // métodos
   public void refuerzos(int refuerzos) {
	   if(defendida==true) {   // if (defendida) 
		   numCaballeros=numCaballeros + refuerzos; // numCaballeros+=refuerzos;
	   } 	   
   }
   public void horda(int orcos) {
	   if(defendida==true) {    
		   numOrcos=numOrcos + orcos; 
	   } 	   
   }
   public void trifulca() {
	   int bajasCaballeros = numOrcos*2;
	   int bajasOrcos  = (int)numCaballeros/2;
	   numCaballeros = numCaballeros - bajasCaballeros;
	   if (numCaballeros<0) {
		   numCaballeros = 0;
	   }
	   numOrcos = numOrcos - bajasOrcos;
	   if (numOrcos < 0) {
		   numOrcos = 0;
	   }
	   if (numCaballeros==0 && numOrcos>0) {
		   defendida = false;
	   }
   }
   public void printEstado() {
	   System.out.println("Nombre: " + nombre);
	   System.out.println("Caballeros: " + numCaballeros);
	   System.out.println("Orcos: " + numOrcos);
	   //System.out.println("Estado: " + estado());
	   if(defendida) {
		   System.out.println("Defendida");
	   } else {
		   System.out.println("Invadida");
	   }
	   System.out.println("==================");
   }
   
   /*
   private int actualizaFuerzas(int actual, int bajas) {
	   
   }
   */
   /*
   private String estado() {
	   String st;
	   if(defendida) {
		   st = "Defendida";
	   } else {
		   st = "Invadida";
	   }
	   return st;
   }
   */
}


public class PruebaCiudad {
  public static void main(String[] args) {
	  
	  Ciudad c1 = new Ciudad("Aranjuez");
	  c1.refuerzos(2);
	  c1.trifulca();
	  c1.printEstado();
	  
	  Ciudad c2 = new Ciudad("Seseña", 2, 2);
	  c2.trifulca();
	  c2.printEstado();
	  c2.refuerzos(4);
	  c2.trifulca();
	  c2.printEstado();
	  
	  Ciudad c3 = new Ciudad("Chinchón");
	  c3.refuerzos(3);
	  c3.horda(2);
	  c3.trifulca();
	  c3.printEstado();
  }

}