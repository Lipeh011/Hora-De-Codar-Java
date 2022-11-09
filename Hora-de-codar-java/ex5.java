import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
      
       int a;
       
       a = sc.nextInt();
      
       if (a == 0) {
    	   System.out.println("O numero é Zero.");
       }
       else if (a < 0) {
    	   System.out.println("O numero é negativo.");
       }
       else {
    	   System.out.println("O numero é postivo.");
       }
   
      
      
      
	}

}
