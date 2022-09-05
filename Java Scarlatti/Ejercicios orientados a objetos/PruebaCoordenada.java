
class Coordenada {
   // atributos
   int x;
   int y;
   // constructores
   public Coordenada(int x, int y) {
	   this.x = x;
	   this.y = y;
   }
   public Coordenada() {  // ctor. "por defecto"
   
   }
   // método
   public void imprimeCoordenada() {
	   System.out.println("(x,y)="+x+","+y);
   }

}

public class PruebaCoordenada {

   public static void main(String[] args) {
       Coordenada c1 = new Coordenada();
	   c1.x = 2;
	   c1.y = 4;
	   c1.imprimeCoordenada();
	   Coordenada c2 = new Coordenada(7, -2);
	   c2.imprimeCoordenada();
   }

}