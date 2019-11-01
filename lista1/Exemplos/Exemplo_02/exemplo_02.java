import java.util.Scanner;  // Import the Scanner class

public class exemplo_02 {
	public static void main(String[] args) {
        System.out.println("Testando entrada de dados");
        
        Scanner meu_scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Qual é a sua idade?");

        // Para uma lista completa de opções 
        // https://www.w3schools.com/java/java_user_input.asp
        
        int x = meu_scanner.nextInt();  

        System.out.println("Nossa! Você já tem " + x + " anos??" ) ;       
        
    }
}


