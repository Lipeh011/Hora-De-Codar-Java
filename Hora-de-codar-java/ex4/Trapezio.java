import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
      
	    double baseMaior;
	    double baseMenor;
	    double altura;
	    double area;
	    
	    baseMaior = sc.nextDouble();
	    baseMenor = sc.nextDouble();
	    altura = sc.nextDouble();
	    area = (baseMaior + baseMenor) * altura / 2; 
	    
		System.out.println("O valor do trapezio é " + area);
		
		sc.close();
	}

}

