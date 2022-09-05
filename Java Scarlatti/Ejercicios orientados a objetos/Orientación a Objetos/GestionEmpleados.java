class Empleado {

  String nombre;
  float salario;
  int edad;
  String fechaNacimiento; 
  // otra alternativa:
  // int diaNac; int mesNac; int anioNac;
  CuentaBancaria cb;
  
  int getEdad() {
	  // código: consulta la fecha actual y compara con fechaNacimiento
	  //         calcula cuántos años tiene el empleado
	  int anios = 25; // 
	  return anios;
  }
  
}
class CuentaBancaria {
	int entidad;
	int numCuenta;
}

public class GestionEmpleados {
	public static void main (String[] args) {
		int numEmpleados = 0; // contador de empleados
		Empleado e1 = new Empleado();  // ya tenemos un OBJETO de tipo EMPLEADO
		e1.nombre = "Ana";
		e1.salario = 40000.50f;
		e1.edad = 25;
		
		
		e1.salario = e1.salario*1.02f;
		System.out.println(e1.nombre + " " + e1.salario);
		
		Empleado e2 = new Empleado();
		e2.nombre = "Luis";
		e2.salario = 32500.0f;
		//e2.edad = 19;
		e2.fechaNacimiento = "2000/05/30";
		System.out.println("Edad del empleado: " + e2.getEdad()  );
		
		Empleado[] empleados = new Empleado[20];
		empleados[0] = e1;
		empleados[1] = e2;
		empleados[2] = new Empleado();
		
		
	}
}