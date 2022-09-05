
public class Entero {
   // atributo
   public int num;  
   
   // constructores
   public Entero(int n) {
	   num = n;
   }
   
   public Entero() {
	   num = 0;   
   }
   
   // métodos
   public boolean esPar() {
	  boolean resul = false;
	  if (num % 2 == 0) {
		 resul = true;
	  }
	  return resul;
    }
	
	public boolean esImpar() {
		return !esPar();
	}
	
	public boolean esPerfecto() {
		int sumaDivisores = 0; // acumulador
		boolean esPerfecto;
		for(int i=1; i<num; i++) {
			if(num%i == 0) { // habemus divisor
			    sumaDivisores = sumaDivisores + i;
			}			
		}
		// probar: return (sumaDivisores == num);
		if (sumaDivisores == num) {
			esPerfecto = true;
		} else {
			esPerfecto = false;
		}
		return esPerfecto;
		
	}
	
	public void duplicar() {
		num = num*2;
	}
	
	public void suma(Entero x) {
		num = num + x.num;
	}
	
	// sobrecargamos el método suma
	public void suma(int x) {
		num = num + x;
	}
	// más métodos...

}