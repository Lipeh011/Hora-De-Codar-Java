import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
      
     String nome;
     System.out.println("Por favor digite seu nome: ");
     nome = sc.nextLine();
     
     System.out.println("Olá," + nome);
      
      
      
	}

}
