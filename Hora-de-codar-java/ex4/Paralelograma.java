import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
      
	    double base;
	    double altura;
	    double area;
	    
	    base = sc.nextDouble();
	    altura = sc.nextDouble();
	    area = base * altura;
	    
		System.out.println("O valor do paralelogramo é " + area);
		
		sc.close();
	}

}


