import java.util.Scanner;  // Import the Scanner class

public class exemplo_06 {
	public static void main(String[] args) {
        
        System.out.println("Entre com um número entre 0 e 10");
        
        Scanner meu_scanner = new Scanner(System.in);         
        int x = meu_scanner.nextInt();  

        while(x<0 || x>10){
        	System.out.println("O intervalo válido é entre 0 e 10");
        	x = meu_scanner.nextInt(); 
        }

               
        
    }
}



