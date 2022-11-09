import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
      
		int a, b, c;
		int soma;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		
		
	        if ( a == b) {
	        	System.out.println("O numero é igual.");
	        }
	    	if (a < b && c < a) {
	    	soma = a + b;	
	    	System.out.println("A soma dos maiores é " + soma);
	    	}   
	        if (b == c) {
	        	System.out.println("O numero é igual.");
	        }
	    	else if (b < c && a < c) {
	        soma = a + c;
	    	System.out.println("A soma dos maiores é "+ soma);
	    }
	        if (c == a) {
	        	System.out.println("O numero é igual.");
	        }
	        else {
	         soma = a + c;
	        	System.out.println("A soma dos maiores é "+ soma);
	        }
	    
	    
	}

}
