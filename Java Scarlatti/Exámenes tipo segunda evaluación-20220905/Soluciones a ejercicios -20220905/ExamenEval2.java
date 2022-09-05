import java.util.Scanner;

class ExamenEval2 {
  private static Scanner lector; 
  
  public static void main(String[] args) {
    //lector = new Scanner(System.in);
    int[] miArray = {2,1 , 2, 4, 5};
  }
  
  // Ejercicio 1
  public static boolean estaOrdenado(int[] array) {
	  boolean ordenado=true;
	  for(int i=0; i<array.length-1 && ordenado==true; i++) {
		  if(array[i]>array[i+1]) {  // no está ordenado
		     ordenado=false;
		  }
	  }
	  return ordenado;
  }
  // Ejercicio 3
  public static double sumaCeldasCondicional (double[][] m, int filas, int col){
	  double sumaFila=0;
	  double total=0;
	  for(int i=0; i<filas; i++) {
		  for(int j=0; j<col; j++) {
			  sumaFila += m[i][j];
		  }
		  if(sumaFila>10) {
			  total+=sumaFila;
		  }
		  sumaFila=0;	  
	  }
	  return total;
  
  }
  
  // Ejercicio 4
  // definir clase Empleado (para compilar)
    public static int darBaja(Empleado[] array, int cont, int codigo) {
	   	
	   boolean encontrado=false;
	   int pos=-1;
	   for(int i=0; i<cont && encontrado==false; i++) {
		   if(array[i].codigo==codigo) {
			   encontrado=true;
			   pos=i; // índice
		   }
	   }
	   /*
	   10 11 null 15 20
	   0   1   2   3  4
	   
	   10 11  15  20 20
	   0   1   2   3  4
	   */
	   if(encontrado==true) {
		   // borrar
		   array[pos] = null;
		   // compactar 
		   for(int i=pos; i<cont-1;i++) {
			   array[i]=array[i+1];
		   }
		   array[cont-1]=null;
		   
		   cont--; 
	   }
	   
	
	   return cont;	
	}
  
  // Ejercicio 6
  public static int sumaNumeros(int inicio, int fin) {
	  int suma=0;
	  if (fin>inicio) {
		 suma = fin + sumaNumeros(inicio, fin-1);
	  } else {
		  suma = fin;
	  }
	  return suma;
  }
  
    public static int sumaNumeros2(int inicio, int fin) {
	  int suma=0;
	  if (inicio<fin) {
		 suma = inicio + sumaNumeros(inicio+1, fin);
	  } else {
		  suma = fin;
	  }
	  return suma;
  }
  
  
}