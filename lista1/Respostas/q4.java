import java.util.Scanner;  // Import the Scanner class
public class q2{
	public static void main(String[] args) {      
        Scanner meu_scanner = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("Entre com o tamanho do lado da quadrado em metros)");
        double L = meu_scanner.nextDouble();   
        
        System.out.println("O seu quadrado tem área de " + L^2 + "m2")
    }
}

