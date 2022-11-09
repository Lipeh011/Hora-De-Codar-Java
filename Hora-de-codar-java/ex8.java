import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
      
		System.out.println("Informe um valor:");
	   
	   int v1 = sc.nextInt();
	   int v2 = sc.nextInt();
	   int soma;
	   if (v2 <= 0) {
		   System.out.println("Por favor informe um numero acima de 0:");
	   }
	   		
	   else {
		   soma = v1 / v2;
		   System.out.println("O resultado é " + soma);
	   }
	}
	
	

}


