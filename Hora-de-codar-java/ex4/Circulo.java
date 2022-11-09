import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
      
	    double raio;
	  
	    double area;
	    
	    raio = sc.nextDouble();
	  
	    area = 3.14*(raio*2);
	    
		System.out.println("O valor do triangulo é " + area);
		
		sc.close();
	}

}


