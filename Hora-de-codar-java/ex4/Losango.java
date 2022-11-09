import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
      
	    double diagonalMaior;
	    double diagonalMenor;
	    double area;
	    
	    diagonalMaior = sc.nextDouble();
	    diagonalMenor = sc.nextDouble();
	    
	    area = diagonalMaior * diagonalMenor / 2;
	    
		System.out.println("O valor do losango é " + area);
		
		sc.close();
	}

}




