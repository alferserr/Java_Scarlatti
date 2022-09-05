

class Numeros implements Cloneable{
	int[] array;
	int id;
	
	public Numeros(int[] array) {
		this.array = array;
	}
	/* sobrescribimos clone */
	protected Object clone() throws CloneNotSupportedException{
		return super.clone(); // llama al clone() de Object
	}
	
	/* sobrescribimos método toString 
       (heredado de la clase Object)	*/
	@Override
	public String toString() {
		String resul ="";
		for(int i:array) {
			resul = resul + i + " ";
		}
		resul = resul + " ID:" + id;
		return resul;
	}
}

public class ClonarPrueba {
	public static void main(String[] args) {
		int[] numeros = {1,2,3};
		Numeros obj1 = new Numeros(numeros);
		System.out.println(obj1);
		obj1.array[0] = 7;
		System.out.println(obj1);
		
		System.out.println(numeros[0]);
		numeros[1] = 8;
		System.out.println(obj1);
		
		Numeros obj2 = null;
		try {
		// queremos clonar obj1
		  obj2 = (Numeros)obj1.clone();
		} catch(Exception e){
			//System.out.println("No se clona");
		};
		
		System.out.println(obj2);
		obj2.array[2] = 5;
		obj1.id = 1;
		obj2.id = 2;
		System.out.println("Tras modificar obj.array[2]");
		System.out.println(obj1);
		System.out.println(obj2);
	}
	/*
		7 8 5 ID:1
		7 8 5 ID:2
		7 8 3 ID:1
		7 8 3 ID:2
		
		
	*/
}

/*
obj1  
	id = 1
	array = #24f5      ---------> 7 8 5  (objeto array en #24f5)
                              |
obj2                          |
	id = 2                    |
	array = #24f5      --------

obj1  (obj1.str = obj1.str.toUpperCase() )
	id = 1
	str = #7887      ---------> "HOLA" (String en #7887)
	
                              
obj2                          
	id = 2                    
	str = #2489      ----------> "Hola"  (String en #2489)
*



*
/

