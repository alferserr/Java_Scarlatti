public class Empleado {
   private static int DNI;
   public static String nombre;
   public static String apellidos;
   private static double salario;
   public static boolean jornada;

    public Empleado(int DNI){
        Empleado.DNI = DNI;
    }


    public static int getDNI(){
        return DNI;
    }

    public static double getSalario(){
        return salario;
    }

    public static void setSalario(double salario) {
        Empleado.salario = salario;
    }

    public static String getNombre(){
        return nombre;
    }

    public static void setNombre(String nombre){
        Empleado.nombre = nombre;
    }

    public static String getApellidos(){
        return apellidos;
    }

    public static void setApellidos(String apellidos){
        Empleado.apellidos = apellidos;
    }

    public static boolean isJornada() {
        return jornada;
    }

    public static void setJornada(boolean jordana) {
        Empleado.jornada = jordana;
    }

    public static void printInforEmpleado(){
        System.out.println("DNI: " + DNI);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Reduccion de jornada: " + jornada);
    }

    public static void Pruebampleado(){
        Empleado e1 = new Empleado(50489070);
        e1.setNombre("Alejandro");
        e1.getNombre();
        e1.setApellidos("Fernández Serrano");
        e1.getApellidos();
        e1.setSalario(2048.78);
        e1.getSalario();
        e1.setJornada(true);
        e1.isJornada();
        printInforEmpleado();

        Empleado e2 = new Empleado(123456);
        e1.nombre = "Rafael";
        e1.apellidos = "Moreno Sierra";
        e1.salario = 900.00;
        e1.jornada = false;
        printInforEmpleado();

    }

    public static void main(String[] args) {
        Pruebampleado();

    }

}
