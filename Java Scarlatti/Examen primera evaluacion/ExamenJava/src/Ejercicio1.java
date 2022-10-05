import java.util.*;
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        int num = 0;
        int positivos = 0;
        int suma = 0;
        int alto = 0;

        do {

            System.out.println("Introduce números hasta introducir un valor negativo");
            num = sc1.nextInt();

            if (num >=0){
                positivos++;
                suma += num;
            }

            if (num >= alto){
                alto = num;
            }

        }while(num >= 0);

        int media = suma/positivos;

        System.out.println("Se han introducido " + positivos + " números positivos o iguales a cero");
        System.out.println("La media de los números es " + media);
        System.out.println("El número más alto introducido es " + alto);
    }
}