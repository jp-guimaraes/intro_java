import java.util.Scanner;  // Import the Scanner class
public class q2{
	public static void main(String[] args) {      
        Scanner meu_scanner = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("Qual a sua idade?");
        int idade = meu_scanner.nextInt();   
        
        if(idade>=18){
            System.out.println("Você é maior de idade!");            
        }
        else{
            System.out.println("Você é menor de idade!");            
        }
        
    }
}

