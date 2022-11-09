import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
      
	    double lado;
	    double lado2;
	    double area;
	    
	    lado = sc.nextDouble();
	    lado2 = sc.nextDouble();
	    
	    area = lado * lado2;
	    
		System.out.println("O valor do quadrado é " + area);
		
		sc.close();
	}

}

