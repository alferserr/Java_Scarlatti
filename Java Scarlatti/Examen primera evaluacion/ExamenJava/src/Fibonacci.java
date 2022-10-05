public class Fibonacci {
    public static void main(String[] args){

        System.out.println(nFibo(7));

    }

    public static int nFibo(int n){
        int num1 = 0;
        int num2 = 1;
        int result = num1+num2;


        for (int fibo =2; fibo < n; fibo++){
            result = num1+num2;
            num1 = num2;
            num2 = result;
        }

        return result;

    }
}
