
public class Coche {
   // atributos
   private String bastidor;
   private String marca;
   private String modelo;
   public int km;
   public boolean nuevo;
   public static int contador = 0;  // atributo de la clase: ¡SOLO HAY UN CONTADOR!

   // constructores
   public Coche(String bastidor, String marca, String modelo) {
	   this.bastidor = bastidor;
	   this.marca = marca;
	   this.modelo = modelo;
	   contador++;
   }

   // métodos
   public String getBastidor() {
	   return bastidor;   
   }
   
   public String getMarca() {
	   return marca;
   }
   public void setMarca(String marca) {
	   this.marca = marca;
   }
   public String getModelo() {
	   return modelo;
   }
   public void setModelo(String modelo) {
	   this.modelo = modelo;
   }
   
   public void imprimeDatosCoche() {
	   String datos = "Bastidor: " + bastidor + " Marca: " + marca;
	   // terminar...
	   System.out.println(datos);
   }
   
}