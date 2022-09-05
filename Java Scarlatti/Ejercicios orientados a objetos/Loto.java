
public class Loto {
  public static void main(String[] args) {
    	
	for(int i=1; i<=6; i++) {
		int num =  (int) ( Math.random() * 49 + 1);
		System.out.print(num + " ");
	}
  }
  
  
}
