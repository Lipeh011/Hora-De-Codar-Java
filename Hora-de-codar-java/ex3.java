import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
      
     String nome;
     int idade;
     
     System.out.println("Qual seu nome ? ");
     
     nome = sc.nextLine();
     System.out.println("Qual sua idade ?");
     idade = sc.nextInt();
     
     System.out.println("Olá "+ nome + " sua idade é "+ idade);
   
      
      
      
	}

}
