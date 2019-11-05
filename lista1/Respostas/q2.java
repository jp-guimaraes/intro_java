import java.util.Scanner;  // Import the Scanner class
public class q2{
	public static void main(String[] args) {      
        Scanner meu_scanner = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("Entre com a primeira nota");
        double nota1 = meu_scanner.nextDouble();   
        
        System.out.println("Entre com a segunda nota");
        double nota2 = meu_scanner.nextDouble(); 

              

        System.out.println("Notas informadas: ");
        System.out.println(nota1);
        System.out.println(",");
        System.out.println(nota2);
             
        
        
        double media = (nota1+nota2)/2;

        System.out.println("Média calculada: ");
        System.out.println(media);
        
    }
}

