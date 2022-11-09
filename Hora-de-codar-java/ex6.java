import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
      
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
	    if (a == b) {
	    	System.out.println("O numero é igual ");
	    }
	    
	    	if (a > b) {
	    	System.out.println("O numero maior é " + a);
	    	}   
	    
	    else if (b == c){
	    	System.out.println("O numero é igual");	
	    }
	    	
	        if (b > c) {
	    	System.out.println("O numero maior é "+ b);
	    }
	        
	        else if (c == b) {
	    	System.out.println("O numero é igual");
	    }
	        else {
	        	System.out.println("O numero maior é "+ c);
	        }
	    
	    
	}

}
